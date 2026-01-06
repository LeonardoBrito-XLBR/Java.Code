package br.com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.example.api.model.FoodModelo;

@Repository
public interface FoodRespository extends JpaRepository<FoodModelo, Long> {

    
} 
