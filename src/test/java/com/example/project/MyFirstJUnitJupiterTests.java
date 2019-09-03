package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.project.Calculator;
import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {
    private final Calculator calculator = new Calculator();
    @Test
    void addition() {
        assertEquals(12, calculator.add(1, 1));
    }
}
