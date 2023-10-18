package com.example.demo.projeto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.projeto.model.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer>{
    
}
