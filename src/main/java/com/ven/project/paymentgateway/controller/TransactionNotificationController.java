package com.ven.project.paymentgateway.controller;

import com.ven.project.paymentgateway.dto.TransactionNotifDto;
import com.ven.project.paymentgateway.service.TransactionNotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionNotificationController {
    private static final Logger logger = LoggerFactory.getLogger(TransactionNotificationController.class);

    @Autowired
    TransactionNotificationService transactionNotificationService;

    @PostMapping("/payment-handler")
    public void transactionNotification(@RequestBody TransactionNotifDto body){
        transactionNotificationService.transactionNotification(body);
    }
}
