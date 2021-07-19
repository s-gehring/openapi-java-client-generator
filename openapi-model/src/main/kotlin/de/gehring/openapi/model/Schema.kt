package de.gehring.openapi.model

/**
 * The Schema Object allows the definition of input and output data types.
 * These types can be objects, but also primitives and arrays.
 * This object is an extended subset of the JSON Schema Specification Wright Draft 00.
 *
 * For more information about the properties, see JSON Schema Core and JSON Schema Validation.
 * Unless stated otherwise, the property definitions follow the JSON Schema.
 *
 * @param nullable  A true value adds "null" to the allowed type specified by the type keyword, only if type is explicitly defined within the same Schema Object. Other Schema Object constraints retain their defined behavior, and therefore may disallow the use of null as a value. A false value leaves the specified or default type unmodified. The default value is false.
 * @param discriminator  Adds support for polymorphism. The discriminator is an object name that is used to differentiate between other schemas which may satisfy the payload description. See Composition and Inheritance for more details.
 * @param readOnly  Relevant only for Schema "properties" definitions. Declares the property as "read only". This means that it MAY be sent as part of a response but SHOULD NOT be sent as part of the request. If the property is marked as readOnly being true and is in the required list, the required will take effect on the response only. A property MUST NOT be marked as both readOnly and writeOnly being true. Default value is false.
 * @param writeOnly  Relevant only for Schema "properties" definitions. Declares the property as "write only". Therefore, it MAY be sent as part of a request but SHOULD NOT be sent as part of the response. If the property is marked as writeOnly being true and is in the required list, the required will take effect on the request only. A property MUST NOT be marked as both readOnly and writeOnly being true. Default value is false.
 * @param xml  This MAY be used only on properties schemas. It has no effect on root schemas. Adds additional metadata to describe the XML representation of this property.
 * @param externalDocs  Additional external documentation for this schema.
 * @param example  A free-form property to include an example of an instance for this schema. To represent examples that cannot be naturally represented in JSON or YAML, a string value can be used to contain the example with escaping where necessary.
 * @param deprecated  Specifies that a schema is deprecated and SHOULD be transitioned out of usage. Default value is false.
 *
 * @param title A title will preferably be short
 * @param multipleOf A numeric instance is only valid if division by this keyword's value results in an integer.

 * @param maximum  If the instance is a number, then this keyword validates if "exclusiveMaximum" is true and instance
 * is less than the provided value, or else if the instance is less than or exactly equal to the provided value.
 * @param exclusiveMaximum If "exclusiveMaximum" is true, then a numeric instance SHOULD NOT be equal to the value
 * specified in "maximum".  If "exclusiveMaximum" is false (or not specified), then a numeric instance MAY be equal to the value of "maximum".
 * @param minimum If the instance is a number, then this keyword validates if "exclusiveMinimum" is true and instance
 * is greater than the provided value, or else if the instance is greater than or exactly equal to the provided value.
 * @param exclusiveMinimum  If "exclusiveMinimum" is true, then a numeric instance SHOULD NOT be equal to the value
 * specified in "minimum".  If "exclusiveMinimum" is false (or not specified), then a numeric instance MAY be equal to the value of "minimum".
 * @param maxLength A string instance is valid against this keyword if its length is less than, or equal to, the value
 * of this keyword. The length of a string instance is defined as the number of its characters as defined by RFC 7159.
 * @param minLength  A string instance is valid against this keyword if its length is greater than, or equal to, the
 * value of this keyword. The length of a string instance is defined as the number of its characters as defined by RFC 7159.
 * @param pattern A string instance is considered valid if the regular expression matches the instance successfully.
 *  Recall: regular expressions are not implicitly anchored.
 * (This string SHOULD be a valid regular expression, according to the Ecma-262 Edition 5.1 regular expression dialect)
 * @param maxItems  An array instance is valid against "maxItems" if its size is less than, or equal to, the value of this keyword.
 * @param minItems  An array instance is valid against "minItems" if its size is greater than, or equal to, the value of this keyword.
 * @param uniqueItems If this keyword has boolean value false, the instance validates successfully.
 * If it has boolean value true, the instance validates successfully if all of its elements are unique.
 * @param maxProperties An object instance is valid against "maxProperties" if its number of properties is less than,
 * or equal to, the value of this keyword.
 * @param minProperties  An object instance is valid against "minProperties" if its number of properties is greater than,
 * or equal to, the value of this keyword.
 * @param required An object instance is valid against this keyword if its property set contains all elements in this keyword's array value.
 * @param enum Elements in the array MAY be of any type, including null. An instance validates successfully against
 * this keyword if its value is equal to one of the elements in this keyword's array value.
 *
 *
 * @param type - Value MUST be a string. Multiple types via an array are not supported.
 * @param allOf - Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema.
 * @param oneOf - Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema.
 * @param anyOf - Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema.
 * @param not - Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema.
 * @param items - Value MUST be an object and not an array. Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema. items MUST be present if the type is array.
 * @param properties - Property definitions MUST be a Schema Object and not a standard JSON Schema (inline or referenced).
 * @param additionalProperties - Value can be boolean or object. Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema. Consistent with JSON Schema, additionalProperties defaults to true.
 * @param description - CommonMark syntax MAY be used for rich text representation.
 * @param format - See Data Type Formats for further details. While relying on JSON Schema's defined formats, the OAS offers a few additional predefined formats.
 * @param default - The default value represents what would be assumed by the consumer of the input as the value of the schema if one is not provided. Unlike JSON Schema, the value MUST conform to the defined type for the Schema Object defined at the same level. For example, if type is string, then default can be "foo" but cannot be 1.
 */
data class Schema(
    val nullable: Boolean,
    val discriminator: Discriminator,
    val readOnly: Boolean,
    val writeOnly: Boolean,
    val xml: Xml,
    val externalDocs: ExternalDocumentation,
    val example: Any,
    val deprecated: Boolean,

    val title: String,
    val multipleOf: Double,
    val maximum: Double,
    val exclusiveMaximum: Boolean,
    val minimum: Double,
    val exclusiveMinimum: Boolean,
    val maxLength: Int,
    val minLength: Int,
    val pattern: String,
    val maxItems: Int,
    val minItems: Int,
    val uniqueItems: Boolean,
    val maxProperties: Int,
    val minProperties: Int,
    val required: List<String>,
    val enum: List<Any>,


    val type: String,
    val allOf: List<ReferenceOr<Schema>>,
    val oneOf: List<ReferenceOr<Schema>>,
    val anyOf: List<ReferenceOr<Schema>>,
    val not: ReferenceOr<Schema>,
    val items: ReferenceOr<Schema>,
    val properties: Map<String, ReferenceOr<Schema>>,
    val additionalProperties: Boolean,
    val description: String,
    val format: String,
    val default: Any,


    )