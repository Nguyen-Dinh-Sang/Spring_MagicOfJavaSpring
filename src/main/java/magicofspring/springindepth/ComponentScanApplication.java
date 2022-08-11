package magicofspring.springindepth;

import magicofspring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("magicofspring.componentscan")
public class ComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ComponentScanApplication.class, args);
		getBeanContext(context);
	}

	private static void getBeanContext(ApplicationContext context) {
		ComponentDAO componentDAO = context.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);
	}

}
