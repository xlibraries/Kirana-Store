package com.kirana.register.pojo.dto;

import com.kirana.register.pojo.enums.CURRENCY;
import com.kirana.register.pojo.enums.TRANSACTION_TYPE;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionDto {

    private Long id;

    private Double amount;

    private CURRENCY currency;

    private TRANSACTION_TYPE transactionType;

    private String description;

    private Long timestamp;
}
