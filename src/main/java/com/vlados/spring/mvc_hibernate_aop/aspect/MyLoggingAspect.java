package com.vlados.spring.mvc_hibernate_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
    @Around("execution(* com.vlados.spring.mvc_hibernate_aop.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();

        System.out.println("LOG begin || " + methodSignature.getName());

        Object targetMethodResult = pjp.proceed();

        System.out.println("LOG end || " + methodSignature.getName());

        return targetMethodResult;
    }
}
