package de.gehring.openapi.model

/**
 * The object provides metadata about the API. The metadata MAY be used by the clients if needed, and MAY be presented in editing or documentation generation tools for convenience.
 *
 * @param title  REQUIRED. The title of the API.
 * @param description  A short description of the API. CommonMark syntax MAY be used for rich text representation.
 * @param termsOfService  A URL to the Terms of Service for the API. MUST be in the format of a URL.
 * @param contact  The contact information for the exposed API.
 * @param license  The license information for the exposed API.
 * @param version  REQUIRED. The version of the OpenAPI document (which is distinct from the OpenAPI Specification version or the API implementation version).
 *
 *
 */
data class Info(
    val title: String,
    val description: String? = null,
    val termsOfService: String? = null,
    val contact: Contact? = null,
    val license: License? = null,
    val version: String
)
