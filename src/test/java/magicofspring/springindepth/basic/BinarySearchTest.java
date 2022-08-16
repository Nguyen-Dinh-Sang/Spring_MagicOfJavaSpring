package magicofspring.springindepth.basic;

import magicofspring.springindepth.BasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BasicApplication.class)
class BinarySearchTest {

    // Get this Bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    void testBasicScenario() {
        int result = binarySearch.binarySearch(new int[] {}, 5);
        assertEquals(3, result);
    }
}