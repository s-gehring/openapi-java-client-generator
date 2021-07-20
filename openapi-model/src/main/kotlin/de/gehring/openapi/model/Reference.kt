package de.gehring.openapi.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * A simple object to allow referencing other components in the specification, internally and externally.
 *
 * The Reference Object is defined by JSON Reference and follows the same structure, behavior and rules.
 *
 * For this specification, reference resolution is accomplished as defined by the JSON Reference specification and not by the JSON Schema specification.
 *
 * @param _ref REQUIRED. The reference string.
 */
data class Reference<T>(@JsonProperty("\$ref") val _ref: String) : ReferenceOr<T>