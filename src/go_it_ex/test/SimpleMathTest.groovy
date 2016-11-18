package go_it_ex.webinar11

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

import static org.junit.Assert.*


public class SimpleMathTest {
    private static SimpleMath simpleMath;

    @BeforeClass
    public static void setUpClass() throws Exception {
        simpleMath = new SimpleMath();
        System.out.println "SetUp method called";
    }

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {
        final int a = 4;
        final int b = 7;
        final int result = simpleMath.add(a, b);
        assertEquals(a + b, result);
    }

    @Test
    public void testSub() throws Exception {
        final int a = 42;
        final int b = 15;
        final int result = simpleMath.sub(a, b);
        assertEquals(a - b, result)
    }

    @Test
    public void testModule() throws Exception {
        final int a = 17;
        final int b = 3;
        final int result = simpleMath.modulo(17, 3);
        assertEquals(a % b, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDiv() throws Exception {
        final int a = 17;
        final int b = 3;
        final int result = simpleMath.div(a, b);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown called");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("tearDownClass called");
    }

}
