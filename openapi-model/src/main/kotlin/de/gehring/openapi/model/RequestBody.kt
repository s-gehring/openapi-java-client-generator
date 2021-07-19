package de.gehring.openapi.model

/**
 * Describes a single request body.
 *
 * @param description  A brief description of the request body. This could contain examples of use. CommonMark syntax MAY be used for rich text representation.
 * @param content  REQUIRED. The content of the request body. The key is a media type or media type range and the value describes it. For requests that match multiple keys, only the most specific key is applicable. e.g. text/plain overrides text
 * @param required  Determines if the request body is required in the request. Defaults to false.
 */
data class RequestBody(
    val description: String,
    val content: Map<String, MediaType>,
    val required: Boolean,
)