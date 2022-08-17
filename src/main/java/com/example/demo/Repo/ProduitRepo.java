package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Produit;

public interface ProduitRepo extends JpaRepository<Produit, String>{

}
