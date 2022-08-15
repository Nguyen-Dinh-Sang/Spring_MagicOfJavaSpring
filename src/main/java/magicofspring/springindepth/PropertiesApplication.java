package magicofspring.springindepth;

import magicofspring.springindepth.properties.ExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

	public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PropertiesApplication.class)) {
            getBeanContext(context);
        }
	}

	private static void getBeanContext(ApplicationContext context) {
		ExternalService externalService = context.getBean(ExternalService.class);

		System.out.println(externalService);
		System.out.println(externalService.returnServiceURL());
	}

}
