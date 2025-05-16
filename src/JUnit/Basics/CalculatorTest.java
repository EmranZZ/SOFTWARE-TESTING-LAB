package JUnit.Basics;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c= new Calculator();

    @Test
    public void add() {
        assertEquals(10,c.add(4,6));
    }

    @Test
    public void subtract() {
        assertEquals(2,c.subtract(6,4));
    }

    @Test
    public void multiply() {
        assertEquals(27,c.multiply(9,3));
        assertEquals(0,c.multiply(0,5));
    }

    @Test
    public void divide() {
        assertEquals(2,c.divide(28,14));
        assertEquals(0,c.divide(0,7));
    }

    @Test
    public void divideByZero() {
        c.divide(40,0); //Should throw Exception
    }
}