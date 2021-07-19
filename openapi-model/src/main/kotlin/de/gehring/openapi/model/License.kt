package de.gehring.openapi.model

/**
 * License information for the exposed API.
 *
 * @param name  REQUIRED. The license name used for the API.
 * @param url  A URL to the license used for the API. MUST be in the format of a URL.
 */
data class License(
    val name: String,
    val url: String?
)