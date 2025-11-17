package com.example.financialmanagementsystem.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    private Long Id;

    private int amount;

    private Long user_id;

    private Long bank_account_id;

    private Long category_id;

    private String transaction_type;

    private LocalDateTime transaction_date;

    private String merchant_name;

    private String notes;

}
