package com.kirana.register.pojo.response.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CurrencyExchangeApiResponse {

    private boolean success;

    private String base;

    private Map<String, Double> rates;
}
