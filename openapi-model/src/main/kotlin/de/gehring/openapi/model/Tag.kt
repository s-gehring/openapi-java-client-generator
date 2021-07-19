package de.gehring.openapi.model

/**
 * Adds metadata to a single tag that is used by the Operation Object.
 * It is not mandatory to have a Tag Object per tag defined in the Operation Object instances.
 *
 * @param name  REQUIRED. The name of the tag.
 * @param description  A short description for the tag. CommonMark syntax MAY be used for rich text representation.
 * @param externalDocs  Additional external documentation for this tag.
 */
data class Tag(
    val name: String,
    val description: String,
    val externalDocs: ExternalDocumentation,
)