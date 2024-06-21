package com.example.shopbackend.controller;

import com.example.shopbackend.model.Role;
import com.example.shopbackend.security.UserPrinciple;
import com.example.shopbackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PutMapping("/change/{role}")
    public ResponseEntity<Object> changeRole(@AuthenticationPrincipal UserPrinciple userPrinciple,
                                             @PathVariable Role role) {
        userService.changeRole(role, userPrinciple.getUsername());
        return ResponseEntity.ok(true);
    }

//    @GetMapping("/home")
//    public String Home() {
//        return "Hello World";
//    }
//
//    @PostMapping("/user")
//    public User newUser(@RequestBody User newUser) {
//        return userService.saveUser(newUser);
//    }
//
//    @GetMapping("/users")
//    public List<User> findAllUsers() {
//        return userService.findAll();
//    }
//
//    @GetMapping("/user/{username}")
//    public Optional<User> getUserByUsername(@PathVariable String username) {
//        return userService.findByUsername(username);
//    }
//
//    @PutMapping("user")
//    public void changeRole(@RequestBody User user){
//        userService.changeRole(user.getRole(), user.getUsername());
//    }


}
