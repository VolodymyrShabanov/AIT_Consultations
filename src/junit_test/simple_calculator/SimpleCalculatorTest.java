package junit_test.simple_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add(2, 2);
        assertEquals(4, result);

//        // Java Unit Testing with JUnit - Tutorial - How to Create And Use Unit Tests
//        assertThrowsExactly(IllegalArgumentException.class,
//                () -> {
//                    grader.determineLeterGrade(-1);
//                });

    }
}