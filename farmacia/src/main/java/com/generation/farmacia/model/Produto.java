package com.generation.farmacia.model;


	import java.time.LocalDateTime;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

	import org.hibernate.annotations.UpdateTimestamp;

	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@Entity
	@Table (name = "tb_produto")
	public class Produto {
			@Id
			@GeneratedValue (strategy = GenerationType.IDENTITY)
			private Long id;
			
			
			@NotBlank(message = " O atributo texto é Obrigatório!")
			@Size(min = 10, max = 1000, message = " O atributo texto deve conter no minimo 10 e no máximo 1000 caracteres")
			private String produto;
			
			@NotBlank(message = " O atributo texto é Obrigatório!")
			@Size(min = 10, max = 1000, message = " O atributo texto deve conter no minimo 10 e no máximo 1000 caracteres")
			private String descricao;
			
			@NotNull
			private double quantidade;
			@UpdateTimestamp
			private LocalDateTime data ;
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public String getProduto() {
				return produto;
			}
			public void setProduto(String produto) {
				this.produto = produto;
			}
			public String getDescricao() {
				return descricao;
			}
			public void setDescricao(String descricao) {
				this.descricao = descricao;
			}
			public double getQuantidade() {
				return quantidade;
			}
			public void setQuantidade(double quantidade) {
				this.quantidade = quantidade;
			}
			public LocalDateTime getData() {
				return data;
			}
			public void setData(LocalDateTime data) {
				this.data = data;
			}
}
