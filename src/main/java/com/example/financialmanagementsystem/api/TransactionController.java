//package com.example.financialmanagementsystem.api;
//
//import com.example.financialmanagementsystem.model.Transaction;
//import com.example.financialmanagementsystem.services.TransactionService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/transactions")
//public class TransactionController {
//
//    @Autowired
//    TransactionService transactionService;
//
//    @GetMapping("get-transactions")
//    public ResponseEntity<> getTransactions() {
//    }
//
//    @GetMapping("/get-by-id{transactionId}")
//    public ResponseEntity<> getTransactionById(@PathVariable Long transactionId) {
//    }
//
//    @PostMapping("create")
//    public ResponseEntity<> createTransaction(@RequestBody request) {
//    }
//
//    @PutMapping("/update{transactionId}")
//    public ResponseEntity<> updateTransaction(
//            @PathVariable Long transactionId,
//            @RequestBody request) {
//    }
//
//    @DeleteMapping("/delete{transactionId}")
//    public ResponseEntity<> deleteTransaction(@PathVariable Long transactionId) {
//    }
//
//    @PutMapping("/{transactionId}/category")
//    public ResponseEntity<> updateTransactionCategory(
//            @PathVariable Long transactionId,
//            @RequestBody @Valid CategoryUpdateRequest request) {
//        return ResponseEntity.ok(updatedTransaction);
//    }
//
//    @GetMapping("/categories")
//    public ResponseEntity<> getCategories() {
//    }
//
//    @GetMapping("/recent")
//    public ResponseEntity<List<Transaction>> getRecentTransactions(@RequestParam(defaultValue = "5") int limit) {
//
//        return new ResponseEntity(transactionService.getRecentTransactions(limit), HttpStatus.OK);
//    }
//}