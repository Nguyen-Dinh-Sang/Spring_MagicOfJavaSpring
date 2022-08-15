package magicofspring.unittesting;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    // 1, 2, 3 => 6
    @Test
    public void sumWith3Numbers() {
        System.out.println("Test1");
        int result = myMath.sum(new int[] {1, 2, 3});
        // Check that the result is 6

        assertEquals(6, result);
    }

    @Test
    public void sumWith1Numbers() {
        System.out.println("Test2");
        assertEquals(3, myMath.sum(new int[] {3}));
    }
}