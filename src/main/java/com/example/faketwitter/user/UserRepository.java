package com.example.faketwitter.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
  @Query("select u from User u where u.email = ?1 OR u.username = ?2")
  Optional<User> findByEmailOrUsername(String email, String username);
}
