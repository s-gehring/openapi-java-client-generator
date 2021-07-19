package de.gehring.openapi.model

/**
 * Describes a single operation parameter.
 *
 * A unique parameter is defined by a combination of a name and location.
 * Parameter Locations
 *
 * There are four possible parameter locations specified by the in field:
 *
 * - path - Used together with Path Templating, where the parameter value is actually part of the operation's URL. This does not include the host or base path of the API. For example, in /items/{itemId}, the path parameter is itemId.
 * - query - Parameters that are appended to the URL. For example, in /items?id=###, the query parameter is id.
 * - header - Custom headers that are expected as part of the request. Note that RFC7230 states header names are case insensitive.
 * - cookie - Used to pass a specific cookie value to the API.
 *
 * @param _in  REQUIRED. The location of the parameter. Possible values are "query", "header", "path" or "cookie".
 * @param description  A brief description of the parameter. This could contain examples of use. CommonMark syntax MAY be used for rich text representation.
 * @param required  Determines whether this parameter is mandatory. If the parameter location is "path", this property is REQUIRED and its value MUST be true. Otherwise, the property MAY be included and its default value is false.
 * @param deprecated  Specifies that a parameter is deprecated and SHOULD be transitioned out of usage. Default value is false.
 * @param allowEmptyValue  Sets the ability to pass empty-valued parameters. This is valid only for query parameters and allows sending a parameter with an empty value. Default value is false. If style is used, and if behavior is n/a (cannot be serialized), the value of allowEmptyValue SHALL be ignored. Use of this property is NOT RECOMMENDED, as it is likely to be removed in a later revision.
 * @param name  REQUIRED. The name of the parameter. Parameter names are case sensitive. (See attribute KDoc for more information)
 * @param style  Describes how the parameter value will be serialized depending on the type of the parameter value. Default values (based on value of in): for query - form; for path - simple; for header - simple; for cookie - form.
 * @param explode  When this is true, parameter values of type array or object generate separate parameters for each value of the array or key-value pair of the map. For other types of parameters this property has no effect. When style is form, the default value is true. For all other styles, the default value is false.
 * @param allowReserved  Determines whether the parameter value SHOULD allow reserved characters, as defined by RFC3986 :/?#[]@!$&'()*+,;= to be included without percent-encoding. This property only applies to parameters with an in value of query. The default value is false.
 * @param schema  The schema defining the type used for the parameter.
 * @param example  Example of the parameter's potential value. The example SHOULD match the specified schema and encoding properties if present. The example field is mutually exclusive of the examples field. Furthermore, if referencing a schema that contains an example, the example value SHALL override the example provided by the schema. To represent examples of media types that cannot naturally be represented in JSON or YAML, a string value can contain the example with escaping where necessary.
 * @param examples  Examples of the parameter's potential value. Each example SHOULD contain a value in the correct format as specified in the parameter encoding. The examples field is mutually exclusive of the example field. Furthermore, if referencing a schema that contains an example, the examples value SHALL override the example provided by the schema.
 * @param content  A map containing the representations for the parameter. The key is the media type and the value describes it. The map MUST only contain one entry.
 */

data class Parameter(
    /**
     * The name of the parameter. Parameter names are case sensitive.
     * If in is "path", the name field MUST correspond to a template expression occurring within the path field in the Paths Object. See Path Templating for further information.
     * If in is "header" and the name field is "Accept", "Content-Type" or "Authorization", the parameter definition SHALL be ignored.
     * For all other cases, the name corresponds to the parameter name used by the in property.
     */
    val name: String,
    val _in: String,
    val description: String,
    val required: Boolean,
    val deprecated: Boolean,
    val allowEmptyValue: Boolean,
    val style: String,
    val explode: Boolean,
    val allowReserved: Boolean,
    val schema: ReferenceOr<Schema>,
    val example: Any,
    val examples: Map<String, ReferenceOr<Example>>,
    val content: Map<String, MediaType>
)