package com.example.financialmanagementsystem.repositories;

import com.example.financialmanagementsystem.model.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;


//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public interface CategoryRepository extends JpaRepository<Category, Long> {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
}