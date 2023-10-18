package com.example.demo.projeto.model;

import javax.print.DocFlavor.STRING;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.UniqueConstraint;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cpf;
    private String nome, rg, telefone, email; 

    public Cliente(){

    }
public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getCpf() {
    return cpf;
}

public String getEmail() {
    return email;
}

public String getNome() {
    return nome;
}

public String getRg() {
    return rg;
}

public String getTelefone() {
    return telefone;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public void setEmail(String email) {
    this.email = email;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void setRg(String rg) {
    this.rg = rg;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public String toString(){
    return "";
}


}
