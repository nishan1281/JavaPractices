package co.appsdevelop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;  //new property declaration first to use in @BeforeEach
    @BeforeEach
    void beforeEach(){
        System.out.println("text before each test");
        calculator = new Calculator();
    }


    @DisplayName("test 4/2 =2")
    @Test
    void testIntegerDivision_whenFourIsDividedByTwo_shouldReturnTwo() {
        int result = calculator.integerDivision(4, 2);
        assertEquals(2, result, ()-> "result not passed");

    }

    @DisplayName("division by zero")
    @Test
    void testIntegerDivisionByZero(){
        int dividend = 4;
        int divisor = 0;
        String expectedExceptionalMessage = "/ by zero";
        ArithmeticException actualException = assertThrows(ArithmeticException.class, ()-> {
            calculator.integerDivision(dividend,divisor);
        }, "division by zero should have thrown an exception");

        assertEquals(expectedExceptionalMessage, actualException.getMessage(),
                "unexpected exception message");


    }
}