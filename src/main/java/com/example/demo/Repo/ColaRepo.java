package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Collaborateur;

public interface ColaRepo extends JpaRepository<Collaborateur, String>{

}
