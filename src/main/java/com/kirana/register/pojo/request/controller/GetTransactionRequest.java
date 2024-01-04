package com.kirana.register.pojo.request.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetTransactionRequest {

    private Long startDate;

    private Long endDate;

    private Integer pageSize;

    private Integer pageIndex;
}
