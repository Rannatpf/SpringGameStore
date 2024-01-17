package com.generation.gamestore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank(message = "O atributo título é Obrigatório!")
	    @Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
	    private String titulo;

	    @NotBlank(message = "O atributo genero é Obrigatório!")
	    @Size(min = 2, max = 50, message = "O atributo genero deve conter no mínimo 2 e no máximo 50 caracteres")
	    private String genero;

	    @NotBlank(message = "O atributo desenvolvedora é Obrigatório!")
	    @Size(min = 2, max = 50, message = "O atributo desenvolvedora deve conter no mínimo 2 e no máximo 50 caracteres")
	    private String desenvolvedora;

	    @NotBlank(message = "O atributo plataforma é Obrigatório!")
	    @Size(min = 2, max = 50, message = "O atributo plataforma deve conter no mínimo 2 e no máximo 50 caracteres")
	    private String plataforma;

	    @NotBlank(message = "O atributo modo de jogo é Obrigatório!")
	    @Size(min = 2, max = 50, message = "O atributo modo de jogo deve conter no mínimo 2 e no máximo 50 caracteres")
	    private String mododejogo;

	    @Min(value = 1900, message = "O ano de lançamento deve ser no mínimo 1900")
	    private int anoLancamento;

	    @ManyToOne
	    @JsonIgnoreProperties("postagem")
	    private Categoria categoria;
	    
		public Long getId() {
			return id;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getDesenvolvedora() {
			return desenvolvedora;
		}

		public void setDesenvolvedora(String desenvolvedora) {
			this.desenvolvedora = desenvolvedora;
		}

		public String getPlataforma() {
			return plataforma;
		}

		public void setPlataforma(String plataforma) {
			this.plataforma = plataforma;
		}

		public String getMododejogo() {
			return mododejogo;
		}

		public void setMododejogo(String mododejogo) {
			this.mododejogo = mododejogo;
		}

		public int getAnoLancamento() {
			return anoLancamento;
		}

		public void setAnoLancamento(int anoLancamento) {
			this.anoLancamento = anoLancamento;
		}

	    
	    
}
