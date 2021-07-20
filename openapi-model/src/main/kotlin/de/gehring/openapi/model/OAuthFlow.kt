package de.gehring.openapi.model

/**
 * Configuration details for a supported OAuth Flow
 *
 * @param authorizationUrl  oauth2 ("implicit", "authorizationCode") 	REQUIRED. The authorization URL to be used for this flow. This MUST be in the form of a URL.
 * @param tokenUrl  oauth2 ("password", "clientCredentials", "authorizationCode") 	REQUIRED. The token URL to be used for this flow. This MUST be in the form of a URL.
 * @param refreshUrl  oauth2 	The URL to be used for obtaining refresh tokens. This MUST be in the form of a URL.
 * @param scopes  oauth2 	REQUIRED. The available scopes for the OAuth2 security scheme. A map between the scope name and a short description for it. The map MAY be empty.
 */
data class OAuthFlow(
    val authorizationUrl: String?,
    val tokenUrl: String?,
    val refreshUrl: String? = null,
    val scopes: Map<String, String>,
)