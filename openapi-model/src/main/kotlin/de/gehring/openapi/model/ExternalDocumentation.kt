package de.gehring.openapi.model

/**
 * Allows referencing an external resource for extended documentation.
 *
 * @param description  A short description of the target documentation. CommonMark syntax MAY be used for rich text representation.
 * @param url  REQUIRED. The URL for the target documentation. Value MUST be in the format of a URL.
 */
data class ExternalDocumentation(
    val description: String? = null,
    val url: String
)