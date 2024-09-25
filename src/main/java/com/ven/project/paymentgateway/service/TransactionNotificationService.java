package com.ven.project.paymentgateway.service;

import com.ven.project.paymentgateway.dto.TransactionNotifDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TransactionNotificationService {
    private static final Logger logger = LoggerFactory.getLogger(TransactionNotificationService.class);

    public void transactionNotification(TransactionNotifDto body){
        if (!StringUtils.isEmpty(body.getOrder_id())){
            String orderId = body.getOrder_id();
            if (orderId.contains("DS")){
                logger.info("dunia steak");
            }else if (orderId.contains("WF")){
                logger.info("we fly");
            }
            logger.info(body.toString());
        }
    }
}
