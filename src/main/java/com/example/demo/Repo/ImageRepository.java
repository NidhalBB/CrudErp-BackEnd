package com.example.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.ImageModel;

public interface ImageRepository extends JpaRepository<ImageModel, String>{
	Optional<ImageModel> findByName(String name);

}
