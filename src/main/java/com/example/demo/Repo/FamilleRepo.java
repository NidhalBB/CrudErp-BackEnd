package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.FamilleProduit;

public interface FamilleRepo extends JpaRepository<FamilleProduit, String>{

}
