package com.example.financialmanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private Long id;
    private Long parent_id;
    private String category_name;
//    private URL icon;
    private String color;
}
