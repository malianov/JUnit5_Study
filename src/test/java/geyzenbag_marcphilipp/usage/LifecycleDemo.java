package geyzenbag_marcphilipp.usage;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LifecycleDemo {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    void beforeEach(TestInfo testInfo) {
        System.out.println("beforeEach: " + testInfo.getDisplayName() + " in " + this);
    }

    @DisplayName("1 + 1 = 2")
    @Test
    void onePlusOneIsTwo() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void zeroPlusTwoIsTwo() {
        assertEquals(2, 0 + 2);
    }

    @AfterEach
    void afterEach(TestInfo testInfo) {
        System.out.println("afterEach: " + testInfo.getDisplayName() + " in " + this);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }
}
