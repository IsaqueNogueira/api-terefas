package com.example.tarefas.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataEntrega;
    private String responsavel;
    
    public Tarefa() {
    }
    
    public Tarefa(Long id, String nome, LocalDate dataEntrega, String responsavel) {
        this.id = id;
        this.nome = nome;
        this.dataEntrega = dataEntrega;
        this.responsavel = responsavel;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public LocalDate getDataEntrega() {
        return dataEntrega;
    }
    
    public String getResponsavel() {
        return responsavel;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataEntrega=" + dataEntrega +
                ", responsavel='" + responsavel + '\'' +
                '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Tarefa tarefa = (Tarefa) obj;
        return id != null ? id.equals(tarefa.id) : tarefa.id == null;
    }
    

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}