//package magicofspring.springindepth;
//
//import magicofspring.springindepth.scope.PersonDAO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//@SpringBootApplication
//public class ScopeApplication {
//
//	private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);
//
//	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(ScopeApplication.class, args);
//		getBeanContext(context);
//	}
//
//	private static void getBeanContext(ApplicationContext context) {
//		PersonDAO personDAO1 = context.getBean(PersonDAO.class);
//		PersonDAO personDAO2 = context.getBean(PersonDAO.class);
//
//		LOGGER.info("{}", personDAO1);
//		LOGGER.info("{}", personDAO1.getJdbcConnection());
//
//		LOGGER.info("{}", personDAO2);
//		LOGGER.info("{}", personDAO2.getJdbcConnection());
//		LOGGER.info("{}", personDAO2.getJdbcConnection());
//	}
//
//}
