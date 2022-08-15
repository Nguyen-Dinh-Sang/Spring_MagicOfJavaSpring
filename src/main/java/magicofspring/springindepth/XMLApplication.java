package magicofspring.springindepth;

import magicofspring.springindepth.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class XMLApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(XMLApplication.class);

	public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            getBeanContext(context);
        }
	}

	private static void getBeanContext(ApplicationContext context) {
		XMLPersonDAO xmlPersonDAO = context.getBean(XMLPersonDAO.class);

		// List bean definition
		LOGGER.info("Bean Loaded -> {}", (Object) context.getBeanDefinitionNames());

		System.out.println(xmlPersonDAO);
		System.out.println(xmlPersonDAO.getXmlJdbcConnection());
	}

}
