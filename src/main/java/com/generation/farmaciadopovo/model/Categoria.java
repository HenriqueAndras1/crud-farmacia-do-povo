package com.generation.farmaciadopovo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_farmaciadopovo")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // GenerationType.IDENTITY, informamos ao provedor que será atributo de PK e serão gerados pela coluna de AI no banco de dados.
	private Long id;
	
	@NotNull(message = "O atributo tipo de categoria é obrigatório, informando se é medicamento, higiene, beleza... ")
	@Size(min = 4, message = "O atributo tipo deve conter no mínimo 2 caracteres!")
	private String tipo;
	
	@NotNull(message = "O atributo descricao é obrigatório! ")
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
