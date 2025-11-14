package com.example.financialmanagementsystem.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/budgets")
public class BudgetController {

    @GetMapping
    public ResponseEntity<> getUserBudgets(
            @RequestParam String period,
            @RequestParam String category) {
    }

    @GetMapping("/{budgetId}")
    public ResponseEntity<> getBudgetById(@PathVariable Long budgetId) {
    }

    @PostMapping
    public ResponseEntity<> createBudget(@RequestBody request) {
    }

    @PutMapping("/update{budgetId}")
    public ResponseEntity<> updateBudget(
            @PathVariable Long budgetId,
            @RequestBody request) {
    }

    @DeleteMapping("/delete{budgetId}")
    public ResponseEntity<> deleteBudget(@PathVariable Long budgetId) {
    }

    @GetMapping("/{budgetId}/progress")
    public ResponseEntity<> getBudgetProgress(@PathVariable Long budgetId) {
    }

    @GetMapping("/alerts")
    public ResponseEntity<> getBudgetAlerts() {
    }
}
