package com.example.financialmanagementsystem.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> health() {
        Map<String, Object> payload = Map.of(
                "status", "UP",
                "timestamp", Instant.now().toString(),
                "month", "Nov."
        );
        return ResponseEntity.ok(payload);
    }

}
    // Get method, should return the profile of user, wrap it with ResponseEntity, if it get the wrong result, we should
    // return 404.( the wrong type of ID, sys error)
    // Input: USER_ID
    // Output: Entity of user(Model of User, class)

