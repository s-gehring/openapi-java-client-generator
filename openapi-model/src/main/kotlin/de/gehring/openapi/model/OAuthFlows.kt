package de.gehring.openapi.model

/**
 * Allows configuration of the supported OAuth Flows.
 *
 * @param implicit  Configuration for the OAuth Implicit flow
 * @param password  Configuration for the OAuth Resource Owner Password flow
 * @param clientCredentials  Configuration for the OAuth Client Credentials flow. Previously called application in OpenAPI 2.0.
 * @param authorizationCode  Configuration for the OAuth Authorization Code flow. Previously called accessCode in OpenAPI 2.0.
 */
data class OAuthFlows(
    val implicit: OAuthFlow? = null,
    val password: OAuthFlow? = null,
    val clientCredentials: OAuthFlow? = null,
    val authorizationCode: OAuthFlow? = null,
)