package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.File;

public interface FileRepo extends JpaRepository<File, String>{

}
