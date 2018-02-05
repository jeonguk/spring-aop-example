package com.jeonguk.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import lombok.extern.slf4j.Slf4j;  

@Slf4j
public class TicketServiceAroundAdvice implements MethodInterceptor {
    
    @Override  
    public Object invoke(MethodInvocation invocation) throws Throwable {  
        log.info("AROUND_ADVICE:BEGIN ......");
        Object returnValue = invocation.proceed();  
        log.info("AROUND_ADVICE:END .......");
        return returnValue;  
    }

}  