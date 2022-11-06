package praticando.vendas.praticandovendas.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate nascimento;
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	@Column(name = "data_cadastro")
	private LocalDate cadastro;

}


