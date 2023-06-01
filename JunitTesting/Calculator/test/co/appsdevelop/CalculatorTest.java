package co.appsdevelop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @DisplayName("test 4/2 =2")
    @Test
    void testIntegerDivision_whenFourIsDividedByTwo_shouldReturnTwo() {
        Calculator calculator = new Calculator();
        int result = calculator.integerDivision(4, 2);
        assertEquals(2, result, ()-> "result not passed");

    }
}