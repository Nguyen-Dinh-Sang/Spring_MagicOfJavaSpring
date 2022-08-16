package magicofspring.aop;

import magicofspring.aop.business.Business1;
import magicofspring.aop.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AOPApplication implements CommandLineRunner {

    @Autowired
    private Business1 business1;

    @Autowired
    private Business2 business2;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(AOPApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(business1.calculateSomeThing());
        logger.info(business2.calculateSomeThing());
    }
}
