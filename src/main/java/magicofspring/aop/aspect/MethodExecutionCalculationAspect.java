package magicofspring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class MethodExecutionCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* magicofspring.aop.business.*.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        // startTime = x
        // Allow execution of method
        // endTime = y

        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time Taken by {} is {}", joinPoint, timeTaken);
    }

    @Around("magicofspring.aop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
    public void trackTiemImpl(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time Taken by Annotation {} is {}", joinPoint, timeTaken);
    }
}