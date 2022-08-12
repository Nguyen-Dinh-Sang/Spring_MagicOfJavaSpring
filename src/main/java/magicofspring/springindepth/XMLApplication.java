package magicofspring.springindepth;

import magicofspring.springindepth.xml.XMLPersonDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class XMLApplication {

	public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            getBeanContext(context);
        }
	}

	private static void getBeanContext(ApplicationContext context) {
		XMLPersonDAO xmlPersonDAO = context.getBean(XMLPersonDAO.class);

		System.out.println(xmlPersonDAO);
		System.out.println(xmlPersonDAO.getXmlJdbcConnection());
	}

}
