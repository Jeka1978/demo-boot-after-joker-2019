package com.example.demo.aop;

import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {

    @Pointcut("execution(* com.example.demo.services..*.say*(..))")
    public void allSayMethods(){}

    @Around("allSayMethods()")
    @SneakyThrows
    public Object handleSayMethods(ProceedingJoinPoint jp){
        String simpleName = jp.getTarget().getClass().getSimpleName();
        System.out.println("а теперь цитата "+simpleName+": ");
        Object retVal = jp.proceed();
        System.out.println("the end");
        return retVal;
    }















}
