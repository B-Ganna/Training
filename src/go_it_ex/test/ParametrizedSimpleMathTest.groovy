package go_it_ex.webinar11;

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized.class)
public class ParametrizedSimpleMathTest {
    private static final SimpleMath simpleMath = new SimpleMath();
    private int numberA;
    private int numberB;
    private int result;

    public ParametrizedSimpleMathTest(int numberA, int numberB, int result) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.result = result;
    }

    //@Parameterized.Parameters(name = "{index}: testAdd({0}*{1}) = {2}")
    //@Parameters
    /*public static Iterable<Object[]> getParametrizedData() {
        Object[][] array = new Object[][] {
            { 1, 1, 1 }, { 2, 2, 4 }, { 8, 2, 16 }, { 4, 5, 20 }, { 5, 5, 25 }
        };
        /*return Arrays.asList(new Object[][] {
            { 1, 1, 1 },
            { 2, 2, 4 },
            { 8, 2, 16 },
            { 4, 5, 20 },
            { 5, 5, 25 }
        });*/
        Collection<Object[]> list = Arrays.asList();
    //}*/

    @Test
    public void testMult() {
        Assert.assertEquals(result, simpleMath.mult(numberA, numberB));
    }
}