package de.gehring.openapi.model

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.LoggerFactory

class TestPetStore {

    private val logger = LoggerFactory.getLogger(this::class.java)

    @Test
    fun `pet store should load without any obvious issue`() {
        val objectMapper = ObjectMapper(YAMLFactory()).registerKotlinModule()

        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)

        val resourceUrl = javaClass.getResource("/pet-store-openapi.yaml")

        val result = objectMapper.readValue(resourceUrl, OpenApi::class.java)
        val text = objectMapper.writeValueAsString(result)

        logger.info { text }
        assertNotNull(result)
        assertContainsNot(text, "_in")
        assertContainsNot(text, "_ref")

    }

    private fun assertContainsNot(result: String, needle: String) {
        assertFalse(result.contains(needle))
    }

}