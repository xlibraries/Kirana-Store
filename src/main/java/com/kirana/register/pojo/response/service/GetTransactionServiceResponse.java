package com.kirana.register.pojo.response.service;

import com.kirana.register.pojo.dto.TransactionDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetTransactionServiceResponse {

    private List<TransactionDto> transactions;

    private Long totalEntries;

    private Integer pageSize;

    private Integer pageIndex;
}
