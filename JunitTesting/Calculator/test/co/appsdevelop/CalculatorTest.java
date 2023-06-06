package co.appsdevelop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;  //new property declaration first to use in @BeforeEach
    @BeforeEach
    void beforeEach(){
        System.out.println("text before each test");
        calculator = new Calculator();
    }
//    Parameterized test of below test
//    @Test
//    void testIntegerDivision_whenFourIsDividedByTwo_shouldReturnTwo() {
//        int result = calculator.integerDivision(4, 2);
//        assertEquals(2, result, ()-> "result not passed");
//
//    }

    @DisplayName("test 4/2 =2")
    @ParameterizedTest

    @CsvSource({
            "4,2,2",
            "6,2,3",
            "8,2,4"
    })

    void parameterizedIntegerDivision(int dividend, int divisor, int expectedResult) {
        int result = calculator.integerDivision(dividend, divisor);
        assertEquals(expectedResult, result, ()-> "result not passed");
    }

//creat a same method as methodSource which will accept stream of arguments
//    private static Stream<Arguments> parameterizedIntegerDivision ()
//    {
//        return Stream.of(
//                Arguments.of(4,2,2),
//                Arguments.of(6,2,3),
//                Arguments.of(8,2,4)
//        );
//    }
}