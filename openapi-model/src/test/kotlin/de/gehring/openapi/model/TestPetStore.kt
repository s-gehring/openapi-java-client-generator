package de.gehring.openapi.model

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class TestPetStore {

    @Test
    fun `pet store should load without any obvious issue`() {
        val objectMapper = ObjectMapper(YAMLFactory()).registerKotlinModule()
        val resourceUrl = javaClass.getResource("/pet-store-openapi.yaml")

        val result = objectMapper.readValue(resourceUrl, OpenApi::class.java)

        assertNotNull(result)

    }

}