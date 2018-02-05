package com.jeonguk;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactoryBean;

import com.jeonguk.aop.TicketServiceAfterReturningAdvice;
import com.jeonguk.aop.TicketServiceAroundAdvice;
import com.jeonguk.aop.TicketServiceBeforeAdvice;
import com.jeonguk.aop.TicketServiceThrowsAdvice;
import com.jeonguk.service.TicketService;
import com.jeonguk.service.impl.RailwayStation;

public class App {

    public static void main(String[] args) {
        
        // ============== Spring 프록시 객체 생성 프로세스 =====================
        
        Advice beforeAdvice = new TicketServiceBeforeAdvice();
        Advice afterReturningAdvice = new TicketServiceAfterReturningAdvice();
        Advice aroundAdvice = new TicketServiceAroundAdvice();
        Advice throwsAdvice = new TicketServiceThrowsAdvice();

        RailwayStation railwayStation = new RailwayStation();
     
        // ProxyFactoryBean를 작성해, 지정된 오브젝트의 Proxy 오브젝트를 작성합니다.
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        // 프록시 인터페이스 설정
        proxyFactoryBean.setInterfaces(TicketService.class);
        // RealSubject 설정
        proxyFactoryBean.setTarget(railwayStation);
        // 인터페이스 메커니즘을 기반으로 JDK를 사용하여 동적 프록시 프록시 객체를 생성하고, CGLIB를 사용하려면이 플래그를 true로 설정해야합니다.
        proxyFactoryBean.setProxyTargetClass(true);
        
        // Adivice 추가
        proxyFactoryBean.addAdvice(afterReturningAdvice);  
        proxyFactoryBean.addAdvice(aroundAdvice);  
        proxyFactoryBean.addAdvice(throwsAdvice);  
        proxyFactoryBean.addAdvice(beforeAdvice);  
        proxyFactoryBean.setProxyTargetClass(false);  
        // ProxyFactoryBean을 통해 프록시 객체 생성
        TicketService ticketService = (TicketService) proxyFactoryBean.getObject();  
        ticketService.sellTicket();
        ticketService.withdraw();
    }

}