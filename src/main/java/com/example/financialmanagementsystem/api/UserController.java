//package com.example.financialmanagementsystem.api;
//
//import com.example.financialmanagementsystem.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("getuserinfo")
//    public ResponseEntity<User> getUserInfo(@RequestBody() Long Id){
//
//        User user = userService.getUserInfo(Id);
//
//
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }
//}
