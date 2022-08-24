package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Famille;

public interface FamilleRepo extends JpaRepository<Famille, String>{

}
