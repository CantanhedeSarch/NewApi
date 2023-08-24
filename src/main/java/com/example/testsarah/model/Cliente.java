package com.example.testsarah.model;

import java.util.Objects;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity //Quando chamamos o @entity estamos dizendo que isso é uma entidade
        //e uma entidade é mapeada para uma tabela no banco de dados
@Table(name="tbcliente")
public class Cliente {

	@Id //Cria a priamri key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //é basicamente a estrategia de geração de valores 
	private Long id;  //id vai referenciar uma coluna 
	
	//@Column(nullable = false) // ou seja essa coluna não pode estar vazia
	private String nome; //nome vai referenciar um nome na coluna

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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
	
}
