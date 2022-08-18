package magicofspring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* magicofspring.aop.data.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution(* magicofspring.aop.business.*.*(..))")
    public void businessLayerExecution() {}

    @Pointcut("magicofspring.aop.aspect.CommonJoinPointConfig.dataLayerExecution() && magicofspring.aop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void allLayerExecution() {}

    @Pointcut("bean(*dao*)")
    public void beanContrainingDao() {}

    @Pointcut("bean(dao*)")
    public void beanStartingWithDao() {}

    @Pointcut("within(magicofspring.aop.data..*)")
    public void dataLayerExecutionWithWithin() {}

    @Pointcut("@annotation(magicofspring.aop.TrackTime)")
    public void trackTimeAnnotation() {}

}