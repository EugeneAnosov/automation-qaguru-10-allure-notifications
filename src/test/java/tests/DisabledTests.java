package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledTests {
    @Test
    @Disabled
    void someTest() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void someTest2() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void someTest3() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void someTest4() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void someTest5() {
        assertTrue(true);
    }
}
