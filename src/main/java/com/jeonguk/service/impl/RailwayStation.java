package com.jeonguk.service.impl;

import com.jeonguk.service.TicketService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RailwayStation implements TicketService {

    @Override
    public void sellTicket() {
       log.info("티켓 ......");
    }

    @Override
    public void inquire() {
        log.info("문의 ......");
    }

    @Override
    public void withdraw() {
        log.info("환불 ......");
    }
    
}