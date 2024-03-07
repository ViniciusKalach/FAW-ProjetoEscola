package com.example.projetoescola.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200,nullable = false)
    private String nome;
    @Column(nullable = false)
    private int cargaHorária;

    public Curso(){
    }

    public Curso(Long id, String nome, int cargaHorária) {
        this.id = id;
        this.nome = nome;
        this.cargaHorária = cargaHorária;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHorária() {
        return cargaHorária;
    }
    
    public void setCargaHorária(int cargaHorária) {
        this.cargaHorária = cargaHorária;
    }

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", cargaHorária=" + cargaHorária + "]";
	}
}
