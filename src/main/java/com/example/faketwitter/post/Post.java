package com.example.faketwitter.post;

import com.example.faketwitter.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.UUID;

@Entity
@Table(name = "posts")
public class Post {
  @Id
  @GeneratedValue(
          strategy = GenerationType.UUID
  )
  private UUID id;
  @ManyToOne()
  @JoinColumn(name = "user_id")
  @OnDelete(action = OnDeleteAction.CASCADE)
  private User user;
  private String title;
  private String content;
  
  public Post() {
  }
  
  public Post(String title, String content) {
    this.title = title;
    this.content = content;
  }
  
  public Post(User user, String title, String content) {
    this.user = user;
    this.title = title;
    this.content = content;
  }
  
  public Post(UUID id, User user, String title, String content) {
    this.id = id;
    this.user = user;
    this.title = title;
    this.content = content;
  }
  
  public UUID getId() {
    return id;
  }
  
  public void setId(UUID id) {
    this.id = id;
  }
  
  public User getUser() {
    return user;
  }
  
  public void setUser(User user) {
    this.user = user;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getContent() {
    return content;
  }
  
  public void setContent(String content) {
    this.content = content;
  }
}
