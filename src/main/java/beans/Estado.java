package beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "est_id")
	private int id;

	@Column(name = "est_nome")
	private String nome;

	@Column(name = "est_sigla")
	private String sigla;

	@OneToMany(mappedBy = "est_id", fetch = FetchType.EAGER)
	private List<Cidade> cidadesLista;

	public List<Cidade> getCidadesLista() {
		return cidadesLista;
	}

	public void setCidadesLista(List<Cidade> cidadesLista) {
		this.cidadesLista = cidadesLista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}