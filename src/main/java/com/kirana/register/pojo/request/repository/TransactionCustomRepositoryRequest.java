package com.kirana.register.pojo.request.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionCustomRepositoryRequest {

    private Long startDate;

    private Long endDate;
}
