import static org.junit.Assert.*;
import example.java.Calculator;
import  org.junit.Test;


public class CalculatorTest {

    @Test
    public void testSum1() {
        Calculator calc = new Calculator();
        int expected = 5;
        int returned = calc.sum(3, 2);

        assertEquals(expected, returned);
    }


    @Test
    public void testSum2() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.sum(6,4));
    }

}