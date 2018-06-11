
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzz {
    private FizzBuzz fb = new FizzBuzz();

    @Test
    public void testEvaluateOne() {
        assertEquals("1",fb.evaluate(1));
    }

    @Test
    public void testEvaluateTwo() {
        assertEquals("2",fb.evaluate(2));
    }

    @Test
    public void testEvaluateThree() {
        assertEquals("Fizz",fb.evaluate(3));
    }

    @Test
    public void testEvaluateFour() {
        assertEquals("4",fb.evaluate(4));
    }

    @Test
    public void testEvaluateFive() {
        assertEquals("Buzz",fb.evaluate(5));
    }

    @Test
    public void testEvaluateSix() {
        assertEquals("Fizz",fb.evaluate(6));
    }

    @Test
    public void testEvaluateFifteen() {
        assertEquals("FizzBuzz",fb.evaluate(15));
    }

    @Test
    public void testEvaluateThirty() {
        assertEquals("FizzBuzz",fb.evaluate(30));
    }
}
