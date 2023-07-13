package com.example.faketwitter.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping(path = "api/v1/user")
public class UserController {
  private final UserService userService;
  
  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }
  
  @PostMapping()
  public User createUser(@RequestBody User user) {
    return userService.createUser(user);
  }
  
  @GetMapping()
  public List<User> getUsers() {
    return userService.getAllUsers();
  }
  
  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable UUID id) {
    userService.deleteUser(id);
  }
}
