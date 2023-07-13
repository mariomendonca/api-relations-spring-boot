package com.example.faketwitter.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
  private final UserRepository userRepository;
  
  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }
  
  public User createUser(User user) {
    return userRepository.save(user);
  }
  
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
  
  public User getUserById(UUID id) {
    return userRepository.findById(id).orElseThrow();
  }
  
  public void deleteUser(UUID id) {
    userRepository.deleteById(id);
  }
}