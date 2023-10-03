package com.example.demo.projeto.controladores;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.projeto.Quarto;
import com.example.demo.projeto.repositorio.QuartoDAO;

@RestController
@RequestMapping(value = "/quarto")
//@CrossOrigin("${origin-allowed}")
public class QuartoController {
    
    @Autowired
    private QuartoDAO repository;


    @GetMapping(value = "/listar")
    public List<Quarto> findAll(){
        List<Quarto> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Quarto findById(@PathVariable Integer id){
        Quarto result = repository.findById(id).get();
        return result;
    }

    @PostMapping(value = "/insert")
    public Quarto insert(@RequestBody Quarto quarto){
        Quarto result = repository.save(quarto);
        return result;
    }
    @DeleteMapping(value = "/{id}")
    public void deletarPorId(@PathVariable Integer id){   
        repository.deleteById(id);
    }

    @PutMapping("atualizar/{id}")
    public Quarto atualizarQuarto(@RequestBody Quarto quartoAtualizado, @PathVariable Integer id){
        Quarto quartoSalvo = repository.findById(id).get();
        BeanUtils.copyProperties(quartoAtualizado, quartoSalvo, "id");
         repository.save(quartoSalvo);
        return quartoSalvo;
    }

}
