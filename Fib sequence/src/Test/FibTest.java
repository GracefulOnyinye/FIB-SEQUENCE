package Test;
import org.junit.*;
public class FibTest {

    Fib fib;

    @Before
    public void setUpInstance(){ fib = new Fib();}

    @Test
    public void checkFirstTenNumbers(){
        Assert.assertEquals(34,fib.Fibonnaci(0,1));
    }
    @Test
    public void ifItIsAFibonacciSequence(){
    Assert.assertTrue("True",fib.Fibonnaci(0,1));
    }
}
