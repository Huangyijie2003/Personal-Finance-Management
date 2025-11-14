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

    private LocalDateTime localDateTime;

}
