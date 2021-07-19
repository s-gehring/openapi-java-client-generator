package de.gehring.openapi.model

/**
 * Describes the operations available on a single path. A Path Item MAY be empty, due to ACL constraints.
 * The path itself is still exposed to the documentation viewer but they will not know which operations and
 * parameters are available.
 *
 * @param _ref  Allows for an external definition of this path item. The referenced structure MUST be in the format of a Path Item Object. In case a Path Item Object field appears both in the defined object and the referenced object, the behavior is undefined.
 * @param summary  An optional, string summary, intended to apply to all operations in this path.
 * @param description  An optional, string description, intended to apply to all operations in this path. CommonMark syntax MAY be used for rich text representation.
 * @param get  A definition of a GET operation on this path.
 * @param put  A definition of a PUT operation on this path.
 * @param post  A definition of a POST operation on this path.
 * @param delete  A definition of a DELETE operation on this path.
 * @param options  A definition of a OPTIONS operation on this path.
 * @param head  A definition of a HEAD operation on this path.
 * @param patch  A definition of a PATCH operation on this path.
 * @param trace  A definition of a TRACE operation on this path.
 * @param servers  An alternative server array to service all operations in this path.
 * @param parameters  A list of parameters that are applicable for all the operations described under this path. These parameters can be overridden at the operation level, but cannot be removed there. The list MUST NOT include duplicated parameters. A unique parameter is defined by a combination of a name and location. The list can use the Reference Object to link to parameters that are defined at the OpenAPI Object's components/parameters.
 */
data class PathItem(
    val _ref: String,
    val summary: String,
    val description: String,
    val get: Operation,
    val put: Operation,
    val post: Operation,
    val delete: Operation,
    val options: Operation,
    val head: Operation,
    val patch: Operation,
    val trace: Operation,
    val servers: List<Server>,
    val parameters: ReferenceOr<Parameter>,
)