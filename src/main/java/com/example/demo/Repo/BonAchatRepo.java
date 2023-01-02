package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Models.BonAchat;
import com.example.demo.Models.ProduitOuvrage;

public interface BonAchatRepo extends JpaRepository<BonAchat, String>{
	@Query(value = "SELECT designation , prix FROM produit_ouvrage",nativeQuery = true)
	List<String> findAllProduit();
}
