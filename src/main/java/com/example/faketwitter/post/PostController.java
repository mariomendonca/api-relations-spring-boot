package com.example.faketwitter.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/post")
public class PostController {
  private final PostService postService;
  
  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }
  
  @PostMapping("/{userid}")
  public Post createPost(@PathVariable UUID userid, @RequestBody Post post) {
    return postService.createPost(post, userid);
  }
  
  @GetMapping
  public List<Post> getAllPosts() {
    return postService.getAllPosts();
  }
  
  @DeleteMapping("/{id}")
  public void deletePost(@PathVariable UUID id) {
    postService.deletePost(id);
  }
}
