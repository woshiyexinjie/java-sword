package com.helloxin;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.condition.JRE.JAVA_8;
import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.MAC;

public class AppTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);

    @BeforeAll
    static void beforeAll() {
        LOGGER.info("call beforeAll()");
    }

    @BeforeEach
    void beforeEach() {
        LOGGER.info("call beforeEach()");
    }

    @Test
    @EnabledOnOs({LINUX, MAC})
    @EnabledOnJre(JAVA_8)
    @RepeatedTest(5)
    void succeedingTest() {
        LOGGER.info("call succeedingTest()");
    }

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba"})
    void palindromes(String candidate) {
        assertTrue(candidate.length() > 0);
    }

    @Test
    void failingTest() {
        LOGGER.info("call failingTest()");
//         fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        LOGGER.info("call skippedTest()");
        // not executed
    }

    @AfterEach
    void afterEach() {
        LOGGER.info("call afterEach()");
    }

    @AfterAll
    static void afterAll() {
        LOGGER.info("call afterAll()");
    }

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Test
    @EnabledOnOs(MAC)
    @interface TestOnMac {
    }
}