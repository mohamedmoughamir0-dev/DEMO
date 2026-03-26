package com.example.demo.repos;

import com.example.demo.entite.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepos extends JpaRepository<Users, Integer> {

}
