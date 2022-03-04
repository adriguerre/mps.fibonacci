package fibonacci;

import fibonacci.Fibonacci;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  Test results
 *
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
    public void testComputeReturnZeroIfTheNumberIsZero(){
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }
}