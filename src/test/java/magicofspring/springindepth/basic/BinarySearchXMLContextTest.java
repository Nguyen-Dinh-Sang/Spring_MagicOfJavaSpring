package magicofspring.springindepth.basic;

import magicofspring.springindepth.BasicApplication;
import magicofspring.springindepth.xml.XMLPersonDAO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/testContext.xml")
class BinarySearchXMLContextTest {

    // Get this Bean from the context
    @Autowired
    XMLPersonDAO xmlPersonDAO;

    @Test
    void testBasicScenario() {
        assertEquals(3, xmlPersonDAO.getXmlJdbcConnection());
    }
}