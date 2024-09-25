package com.ven.project.paymentgateway.util;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServiceResult<T> {
    private T data;
    private boolean isSuccess;
    private String errorMessage;
}
