package Jeni.sGames.example.minhaLojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 3, max = 35)
	private String nome;
	
	@NotNull
	@Size(min = 3, max = 35)
	private String marca;
	
	@NotNull
	private double preco;
	
	@NotNull
	private int quantidade;

	@ManyToOne	
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
}
