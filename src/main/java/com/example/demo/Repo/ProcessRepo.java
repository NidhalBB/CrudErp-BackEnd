package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Process;

public interface ProcessRepo extends JpaRepository<Process , String>{

}
