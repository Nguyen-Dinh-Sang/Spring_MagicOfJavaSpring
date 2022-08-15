package magicofspring.unittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertTest {

    @Test
    public void testCase1() {
        assertEquals(1, 1);
    }

    @Test
    public void testCase2() {
        assertTrue(1 + 1 == 2);
    }

    @Test
    public void testCase3() {
        assertFalse(1 + 1 == 3);
    }

    @Test
    public void testCase4() {
        assertNull(null);
        //assertNotNull(null);
        assertArrayEquals(new int[] {1, 2, 4}, new int[] {1, 2, 4});
    }
}