package de.gehring.openapi.model

/**
 * An object representing a Server.
 *
 * @param url  REQUIRED. A URL to the target host. This URL supports Server Variables and MAY be relative, to indicate that the host location is relative to the location where the OpenAPI document is being served. Variable substitutions will be made when a variable is named in {brackets}.
 * @param description  An optional string describing the host designated by the URL. CommonMark syntax MAY be used for rich text representation.
 * @param variables  A map between a variable name and its value. The value is used for substitution in the server's URL template.
 */
data class Server(
    val url: String,
    val description: String?,
    val variables: Map<String, ServerVariable>?
)