package de.gehring.openapi.model

/**
 * Describes a single response from an API Operation, including design-time, static links to operations based on the response.
 *
 * @param description  REQUIRED. A short description of the response. CommonMark syntax MAY be used for rich text representation.
 * @param headers  Maps a header name to its definition. RFC7230 states header names are case insensitive. If a response header is defined with the name "Content-Type", it SHALL be ignored.
 * @param content  A map containing descriptions of potential response payloads. The key is a media type or media type range and the value describes it. For responses that match multiple keys, only the most specific key is applicable. e.g. text/plain overrides text/*
 * @param links  A map of operations links that can be followed from the response. The key of the map is a short name for the link, following the naming constraints of the names for Component Objects.
*/*/
data class Response(
    val description: String,
    val headers: Map<String, ReferenceOr<Header>>? = null,
    val content: Map<String, MediaType>? = null,
    val links: Map<String, ReferenceOr<Link>>? = null
)