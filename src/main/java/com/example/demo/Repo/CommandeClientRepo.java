package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Accord;

public interface CommandeClientRepo extends JpaRepository<Accord, String>{

}
