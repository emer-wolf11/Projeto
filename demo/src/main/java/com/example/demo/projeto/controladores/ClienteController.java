package com.example.demo.projeto.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.projeto.model.Cliente;
import com.example.demo.projeto.model.Quarto;
import com.example.demo.projeto.repositorio.ClienteDAO;
import com.example.demo.projeto.repositorio.QuartoDAO;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteDAO repository;

    @PostMapping(value = "/insert")
    public Cliente insert(@RequestBody Cliente cliente){
        Cliente result = repository.save(cliente);
        return result;
    }

    @GetMapping(value = "/listar")
    public List<Cliente> findAll(){
        List<Cliente> result = repository.findAll();
        return result;
    }
}
