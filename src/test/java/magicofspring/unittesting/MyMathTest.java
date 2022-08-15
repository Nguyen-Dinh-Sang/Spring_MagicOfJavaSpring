package magicofspring.unittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    MyMath myMath = new MyMath();

    // 1, 2, 3 => 6
    @Test
    void sumWith3Numbers() {
        int result = myMath.sum(new int[] {1, 2, 3});
        // Check that the result is 6

        assertEquals(6, result);
    }

    @Test
    void sumWith1Numbers() {
        assertEquals(3, myMath.sum(new int[] {3}));
    }
}