package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Client;

public interface ClientRepo  extends JpaRepository<Client, String>{

}
