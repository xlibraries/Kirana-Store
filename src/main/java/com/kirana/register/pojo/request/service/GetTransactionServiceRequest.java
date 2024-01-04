package com.kirana.register.pojo.request.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetTransactionServiceRequest {

    private Long startDate;

    private Long endDate;

    private Integer pageSize;

    private Integer pageIndex;
}
