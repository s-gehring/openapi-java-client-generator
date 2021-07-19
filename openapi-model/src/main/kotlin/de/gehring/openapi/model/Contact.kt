package de.gehring.openapi.model

/**
 * Contact information for the exposed API.
 *
 * @param name  The identifying name of the contact person/organization.
 * @param url  The URL pointing to the contact information. MUST be in the format of a URL.
 * @param email  The email address of the contact person/organization. MUST be in the format of an email address.
 */
data class Contact(
    val name: String? = null,
    val url: String? = null,
    val email: String? = null
)