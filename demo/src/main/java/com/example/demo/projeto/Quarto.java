package com.example.demo.projeto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quarto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer numero, andar;
    private double valorQuarto;
    private boolean status = false;
    private String tipo_quarto;

    public Quarto(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipoQuarto() {
        return tipo_quarto;
    }

    public void setTipoQuarto(String tipo_quarto) {
        
        this.tipo_quarto = tipo_quarto;
    }

    public double getValorQuarto() {
        return valorQuarto;
    }

    public void setValorQuarto(double valorQuarto) {
        this.valorQuarto = valorQuarto;
    }

    public Boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public String toString(){
        String qualStatus;
        if (getStatus() == true){
            qualStatus = "Quarto em uso";
        }else{
            qualStatus = "Quarto livre";
        }
        
        return "ID: " + id + "/ Valor Quarto: " + valorQuarto + " Status: " + qualStatus;
    }
}