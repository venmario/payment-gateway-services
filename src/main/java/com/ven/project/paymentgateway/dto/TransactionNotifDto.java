package com.ven.project.paymentgateway.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Map;


@Data
@NoArgsConstructor
public class TransactionNotifDto {
    private String transaction_id;
    private String order_id;
    private String gross_amount;
    private String transaction_time;
    private String transaction_status;
    private String status_message;
    private String status_code;
    private String payment_type;
    private String issuer;
    private ArrayList<Map<String, Object>> va_numbers;
    private String merchant_id;
    private String fraud_status;
    private String currency;
    private String signature_key;
    private String settlement_time;
    private ArrayList<Map<String, Object>> payment_amounts;
}
