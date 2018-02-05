package com.jeonguk.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TicketServiceAfterReturningAdvice implements AfterReturningAdvice {
    
    @Override  
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        log.info("AFTER_RETURNING：이 서비스는 끝났어 ......"); 
    }  
    
}