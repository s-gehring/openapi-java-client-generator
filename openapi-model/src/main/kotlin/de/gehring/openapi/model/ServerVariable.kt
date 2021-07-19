package de.gehring.openapi.model

/**
 * An object representing a Server Variable for server URL template substitution.
 *
 * @param enum  An enumeration of string values to be used if the substitution options are from a limited set. The array SHOULD NOT be empty.
 * @param default  REQUIRED. The default value to use for substitution, which SHALL be sent if an alternate value is not supplied. Note this behavior is different than the Schema Object's treatment of default values, because in those cases parameter values are optional. If the enum is defined, the value SHOULD exist in the enum's values.
 * @param description  An optional description for the server variable. CommonMark syntax MAY be used for rich text representation.
 */
data class ServerVariable(
    val enum: List<String>?,
    val default: String,
    val description: String?,
)