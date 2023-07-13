package com.example.faketwitter.post;

import com.example.faketwitter.user.User;
import com.example.faketwitter.user.UserRepository;
import com.example.faketwitter.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PostService {
  private final PostRepository postRepository;
  private final UserService userService;
  
  @Autowired
  public PostService(PostRepository postRepository, UserService userService) {
    this.postRepository = postRepository;
    this.userService = userService;
  }
  
  public Post createPost(Post post, UUID userId) {
    User user = userService.getUserById(userId);
    post.setUser(user);
    return postRepository.save(post);
  }
  
  public List<Post> getAllPosts() {
    return postRepository.findAll();
  }
}
