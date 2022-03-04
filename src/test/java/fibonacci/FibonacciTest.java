package fibonacci;

import fibonacci.Fibonacci;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  Test results
 *  fibonacci < 0 -> raises an exception
 *  fibonacci 0 -> 0
 *  fibonacci 1 -> 1
 *  fibonacci 2 -> 1
 *  fibonacci 3 -> 2
 *  fibonacci 4 -> 3
 *  fibonacci 5 -> 5
 *  fibonacci 6 -> 8
 *  fibonacci 7 -> 13
 *  fibonacci 8 -> 21
 */

class FibonacciTest {

    private Fibonacci fibonacci;
    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }
    @AfterEach
    public void finish(){
        fibonacci = null;
    }

    @Test
    public void testComputeReturnOneIfTheNumberIsOne(){
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnZeroIfTheNumberIsZero(){
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnOneIfTheNumberIsTwo(){
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(2);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnTwoIfTheNumberIsThree(){
        int expectedValue = 2;
        int obtainedValue = fibonacci.compute(3);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnThreeIfTheNumberIsFour(){
        int expectedValue = 3;
        int obtainedValue = fibonacci.compute(4);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnFiveIfTheNumberIsFive(){
        int expectedValue = 5;
        int obtainedValue = fibonacci.compute(5);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnEightIfTheNumberIsSix(){
        int expectedValue = 8;
        int obtainedValue = fibonacci.compute(6);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnThirteenIfTheNumberIsSeven(){
        int expectedValue = 13;
        int obtainedValue = fibonacci.compute(7);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnTwentyoneIfTheNumberIsEight(){
        int expectedValue = 21;
        int obtainedValue = fibonacci.compute(8);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnThirtyfourIfTheNumberIsNine(){
        int expectedValue = 34;
        int obtainedValue = fibonacci.compute(9);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testComputeReturnExceptionIfTheNumberIsNegative(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
        //Con esto comprueba si sale una excepcion o no
    }
}