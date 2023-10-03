package com.example.demo.projeto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.projeto.Quarto;

public interface QuartoDAO extends JpaRepository<Quarto, Integer>{
    
}
