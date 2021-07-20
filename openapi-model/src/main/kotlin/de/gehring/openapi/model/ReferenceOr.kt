package de.gehring.openapi.model

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import de.gehring.openapi.serialization.ReferenceOrDeserializer

/**
 * Holds either a reference to T or a T itself.
 */
@JsonDeserialize(
    using = ReferenceOrDeserializer::class
)
interface ReferenceOr<T>