package de.gehring.openapi.model

import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * A map of possible out-of band callbacks related to the parent operation.
 * Each value in the map is a Path Item Object that describes a set of requests that may be initiated by the API
 * provider and the expected responses. The key value used to identify the path item object is an expression, evaluated
 * at runtime, that identifies a URL to use for the callback operation.
 */
@JsonDeserialize(
    using = JsonDeserializer.None::class
)
class Callback : HashMap<KeyExpression, PathItem>(), ReferenceOr<Callback>