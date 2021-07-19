package de.gehring.openapi.model

/**
 *
 * Each Media Type Object provides schema and examples for the media type identified by its key.
 *
 * @param schema  The schema defining the content of the request, response, or parameter.
 * @param example  Example of the media type. The example object SHOULD be in the correct format as specified by the media type. The example field is mutually exclusive of the examples field. Furthermore, if referencing a schema which contains an example, the example value SHALL override the example provided by the schema.
 * @param examples  Examples of the media type. Each example object SHOULD match the media type and specified schema if present. The examples field is mutually exclusive of the example field. Furthermore, if referencing a schema which contains an example, the examples value SHALL override the example provided by the schema.
 * @param encoding  A map between a property name and its encoding information. The key, being the property name, MUST exist in the schema as a property. The encoding object SHALL only apply to requestBody objects when the media type is multipart or application/x-www-form-urlencoded.
 */
data class MediaType(
    val schema: ReferenceOr<Schema>,
    val example: Any,
    val examples: Map<String, ReferenceOr<Example>>,
    val encoding: Map<String, Encoding>
)