package com.jeonguk.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TicketServiceThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex) {
        log.info("AFTER_THROWING ......");
    }

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
        log.info("잘못된 프로세스 호출 ......");
    }

}