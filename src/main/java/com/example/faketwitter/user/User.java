package com.example.faketwitter.user;

import com.example.faketwitter.post.Post;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity()
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(
          strategy = GenerationType.UUID
  )
  private UUID id;
  private String name;
  @Column(unique = true)
  private String username;
  @Column(unique = true)
  private String email;
  private String password;
  public User() {
  }
  
  public User(String name, String username, String email, String password) {
    this.name = name;
    this.username = username;
    this.email = email;
    this.password = password;
  }
  
  public User(UUID id, String name, String username, String email, String password) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.email = email;
    this.password = password;
  }
  
  public UUID getId() {
    return id;
  }
  
  public void setId(UUID id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getUsername() {
    return username;
  }
  
  public void setUsername(String username) {
    this.username = username;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
}
