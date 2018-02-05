package com.jeonguk.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TicketServiceBeforeAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {  
        log.info("BEFORE_ADVICE: 판매점에 오신 것을 환영합니다 ......"); 
    }  
    
}