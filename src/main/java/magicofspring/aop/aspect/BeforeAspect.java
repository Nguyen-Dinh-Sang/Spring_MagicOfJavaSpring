package magicofspring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration
@Configuration
@Aspect
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of method calls I would intercept
    @Before("execution(* magicofspring.aop.business.*.*(..))")
    public void before(JoinPoint joinPoint) {
        logger.info("Check for user access");
        logger.info("Intercepted Method Calls {}", joinPoint);
    }
}
