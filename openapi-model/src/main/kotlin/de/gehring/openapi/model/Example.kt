package de.gehring.openapi.model

/**
 * In all cases, the example value is expected to be compatible with the type schema of its associated value.
 * Tooling implementations MAY choose to validate compatibility automatically, and reject the example value(s) if incompatible.
 *
 * @param summary  Short description for the example.
 * @param description  Long description for the example. CommonMark syntax MAY be used for rich text representation.
 * @param value  Embedded literal example. The value field and externalValue field are mutually exclusive. To represent examples of media types that cannot naturally represented in JSON or YAML, use a string value to contain the example, escaping where necessary.
 * @param externalValue  A URL that points to the literal example. This provides the capability to reference examples that cannot easily be included in JSON or YAML documents. The value field and externalValue field are mutually exclusive.
 */
data class Example(
    val summary: String? = null,
    val description: String? = null,
    val value: Any? = null,
    val externalValue: String? = null,
)