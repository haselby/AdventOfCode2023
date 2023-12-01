package day01;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


// Unit Test Naming Standard:   UnitOfWork_StateUnderTest_ExpectedBehavior
// https://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html
@DisplayName("Day 1, Part 1 - MyFirstClass Test")
public class MyFirstClassTest {
    @BeforeAll
    static void beforeAll() {

    }

    @BeforeEach
    void beforeEach() {

    }

    @AfterEach
    void afterEach() {

    }

    @AfterAll
    static void afterAll() {

    }


    @Test
    @DisplayName("Test Framework HelloWorld -  Testing a known true statement - Should Return True")
    void testFrameworkHelloWorld_TestingAKnownTrueStatement_ShouldReturnTrue() {
        assertEquals(20231225, 20231225);
    }

}
