package com.example.financialmanagementsystem.services;

import com.example.financialmanagementsystem.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public boolean isDatabaseConnected() {
        try {
            categoryRepository.count();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
