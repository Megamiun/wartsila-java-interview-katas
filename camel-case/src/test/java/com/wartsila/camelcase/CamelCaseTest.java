package com.wartsila.camelcase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CamelCaseTest {
    @Test
    public void camelCase_stringWithUnderscoresLowerStart_success() {
        String input = "digital_Product_Development";
        System.out.println("input: " + input);
        assertEquals("digitalProductDevelopment", CamelCase.toCamelCase(input));
    }

    @Test
    public void camelCase_testSomeDashLowerStart_success() {
        String input = "digital-Product-Development";
        System.out.println("input: " + input);
        assertEquals("digitalProductDevelopment", CamelCase.toCamelCase(input));
    }

    @Test
    public void camelCase_testSomeDashLowerInTheMiddle_success() {
        String input = "digital-product-development";
        System.out.println("input: " + input);
        assertEquals("digitalProductDevelopment", CamelCase.toCamelCase(input));
    }

    @Test
    public void camelCase_testNull_shouldReturnNull() {
        String input = null;
        System.out.println("input: " + input);
        assertNull(CamelCase.toCamelCase(input));
    }

    @Test
    public void camelCase_testEmpty_shouldReturnSame() {
        String input = "digital-product-development";
        System.out.println("input: " + input);
        assertEquals("digitalProductDevelopment", CamelCase.toCamelCase(input));
    }

    @Test
    public void camelCase_testBlank_shouldDropSpaces() {
        String input = "                  ";
        System.out.println("input: " + input);
        assertEquals("", CamelCase.toCamelCase(input));
    }

    @Test
    public void camelCase_testStringWithSpaces_shouldDropSpaces() {
        String input = "         a-cool-test         ";
        System.out.println("input: " + input);
        assertEquals("aCoolTest", CamelCase.toCamelCase(input));
    }

    @Test
    public void camelCase_testStringWithSpacesInTheMiddle_shouldDropSpaces() {
        String input = "         a cool test         ";
        System.out.println("input: " + input);
        assertEquals("acooltest", CamelCase.toCamelCase(input));
    }
}
