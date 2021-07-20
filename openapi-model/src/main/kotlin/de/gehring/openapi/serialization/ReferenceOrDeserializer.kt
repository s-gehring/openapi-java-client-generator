package de.gehring.openapi.serialization

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.databind.deser.ContextualDeserializer
import de.gehring.openapi.model.Reference
import de.gehring.openapi.model.ReferenceOr

class ReferenceOrDeserializer<T : ReferenceOr<T>>() : JsonDeserializer<ReferenceOr<T>>(), ContextualDeserializer {

    private var baseType: JavaType? = null

    private constructor(javaType: JavaType) : this() {
        this.baseType = javaType
    }

    override fun deserialize(
        p: JsonParser,
        ctxt: DeserializationContext
    ): ReferenceOr<T> {
        val node = p.readValueAsTree<JsonNode>()
        val refNode = node.get("\$ref")
        if (refNode == null) {
            val traverser = node.traverse()
            traverser.codec = p.codec
            traverser.nextToken()
            return ctxt.readValue(traverser, baseType)
        }
        return Reference(refNode.asText())
    }

    override fun createContextual(ctxt: DeserializationContext, property: BeanProperty?): JsonDeserializer<*> {
        val type = ctxt.contextualType ?: throw IllegalStateException("Failed to infer type for property.")
        if (type.bindings.typeParameters.isEmpty()) {
            return ctxt.findNonContextualValueDeserializer(type)
        }
        return ReferenceOrDeserializer<T>(type.bindings.typeParameters[0])
    }
}