package magicofspring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* magicofspring.aop.data.*.*(..))")
    public void dataLayerExecution() {}
}
