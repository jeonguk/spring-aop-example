package com.jeonguk.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;

/**
 * ProxyFactoryBean을 통해 프록시 객체를 수동으로 생성
 * @author jeonguk
 *
 */
public class FilteredAdvisor implements PointcutAdvisor {
    
    private Pointcut pointcut;  
    private Advice advice;  
  
    public FilteredAdvisor(Pointcut pointcut, Advice advice) {  
        this.pointcut = pointcut;  
        this.advice = advice;  
    }  
  
    /** 
     * Get the Pointcut that drives this advisor. 
     */  
    @Override  
    public Pointcut getPointcut() {  
        return pointcut;  
    }  
  
    @Override  
    public Advice getAdvice() {  
        return advice;  
    }  
  
    @Override  
    public boolean isPerInstance() {  
        return false;  
    }

}