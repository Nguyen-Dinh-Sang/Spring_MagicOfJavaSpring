//package magicofspring.springindepth;
//
//import magicofspring.springindepth.cdi.SomeCDIBusiness;
//import magicofspring.springindepth.scope.PersonDAO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//@SpringBootApplication
//public class CDIApplication {
//
//	private static Logger LOGGER = LoggerFactory.getLogger(CDIApplication.class);
//
//	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(CDIApplication.class, args);
//		getBeanContext(context);
//	}
//
//	private static void getBeanContext(ApplicationContext context) {
//		SomeCDIBusiness someCDIBusiness = context.getBean(SomeCDIBusiness.class);
//
//		LOGGER.info("{}", someCDIBusiness);
//		LOGGER.info("{}", someCDIBusiness.getSomeCDIDAO());
//	}
//
//}
