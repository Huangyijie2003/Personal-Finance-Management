package com.example.financialmanagementsystem.api;

import com.example.financialmanagementsystem.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/database")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("check-db")
    public ResponseEntity<String> checkdb() {
        if (categoryService.isDatabaseConnected()) {
            return ResponseEntity.ok("DB Connected Successfully!");
        } else {
            return ResponseEntity.status(500).body("DB Connection Failed!");
        }
    }
}
