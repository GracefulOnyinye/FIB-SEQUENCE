package Test;
import org.junit.*;
public class MathsTest {
    Maths maths;
    @Before
    public void setUpInstance(){maths = new Maths();}
    @Test
    public void checkTheSumOfTwoNumbersEqualsThree(){
        Assert.assertEquals(3,maths.addTwoNumbers(90,2));

    }
    @Test
    public void checkPrimeNumbers() {
        Assert.assertTrue ("true",maths.primeNumbers(1
        ));
    }

}
