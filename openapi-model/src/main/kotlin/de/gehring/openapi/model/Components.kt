package de.gehring.openapi.model

/**
 *
 * Holds a set of reusable objects for different aspects of the OAS. All objects defined within the components object will have no effect on the API unless they are explicitly referenced from properties outside the components object.
 * All the fixed fields declared [...] are objects that MUST use keys that match the regular expression: ^[a-zA-Z0-9\.\-_]+$.
 *
 * @param schemas  An object to hold reusable Schema Objects.
 * @param responses  An object to hold reusable Response Objects.
 * @param parameters  An object to hold reusable Parameter Objects.
 * @param examples  An object to hold reusable Example Objects.
 * @param requestBodies  An object to hold reusable Request Body Objects.
 * @param headers  An object to hold reusable Header Objects.
 * @param securitySchemes  An object to hold reusable Security Scheme Objects.
 * @param links  An object to hold reusable Link Objects.
 * @param callbacks  An object to hold reusable Callback Objects.
 */
data class Components(
    val schemas: Map<String, ReferenceOr<Schema>>? = null,
    val responses: Map<String, ReferenceOr<Response>>? = null,
    val parameters: Map<String, ReferenceOr<Parameter>>? = null,
    val examples: Map<String, ReferenceOr<Example>>? = null,
    val requestBodies: Map<String, ReferenceOr<RequestBody>>? = null,
    val headers: Map<String, ReferenceOr<Header>>? = null,
    val securitySchemes: Map<String, ReferenceOr<SecurityScheme>>? = null,
    val links: Map<String, ReferenceOr<Link>>? = null,
    val callbacks: Map<String, ReferenceOr<Callback>>? = null,
)