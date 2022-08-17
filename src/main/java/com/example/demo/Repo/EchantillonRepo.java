package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Models.Echantillon;

public interface EchantillonRepo extends JpaRepository<Echantillon, String>{
	
	@Query("SELECT numEchantillon FROM Echantillon")
    Echantillon findByNumEchantillon(int numEchantillon );

}
