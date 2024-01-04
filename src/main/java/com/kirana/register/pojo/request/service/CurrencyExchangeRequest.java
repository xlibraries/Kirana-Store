package com.kirana.register.pojo.request.service;

import com.kirana.register.pojo.enums.CURRENCY;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CurrencyExchangeRequest {

    private CURRENCY fromCurrency;

    private CURRENCY toCurrency;

    private Double amount;
}
