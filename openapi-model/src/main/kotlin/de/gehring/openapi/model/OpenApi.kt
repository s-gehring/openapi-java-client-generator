package de.gehring.openapi.model

/**
 * This is the root document object of the OpenAPI document.
 *
 * @param openapi  REQUIRED. This string MUST be the semantic version number of the OpenAPI Specification version that the OpenAPI document uses. The openapi field SHOULD be used by tooling specifications and clients to interpret the OpenAPI document. This is not related to the API info.version string.
 * @param info  REQUIRED. Provides metadata about the API. The metadata MAY be used by tooling as required.
 * @param servers  An array of Server Objects, which provide connectivity information to a target server. If the servers property is not provided, or is an empty array, the default value would be a Server Object with a url value of /.
 * @param paths  REQUIRED. The available paths and operations for the API.
 * @param components  An element to hold various schemas for the specification.
 * @param security  A declaration of which security mechanisms can be used across the API. The list of values includes alternative security requirement objects that can be used. Only one of the security requirement objects need to be satisfied to authorize a request. Individual operations can override this definition. To make security optional, an empty security requirement ({}) can be included in the array.
 * @param tags  A list of tags used by the specification with additional metadata. The order of the tags can be used to reflect on their order by the parsing tools. Not all tags that are used by the Operation Object must be declared. The tags that are not declared MAY be organized randomly or based on the tools' logic. Each tag name in the list MUST be unique.
 * @param externalDocs  Additional external documentation.
 */
data class OpenApi(
    val openapi: String,
    val info: Info,
    val servers: List<Server>? = null,
    val paths: Paths,
    val components: Components? = null,
    val security: List<SecurityRequirement>? = null,
    val tags: List<Tag>? = null,
    val externalDocs: ExternalDocumentation? = null
)