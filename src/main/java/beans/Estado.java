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
	@Column(name = "id")
	private int id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "sigla")
	private String sigla;

	@OneToMany(mappedBy = "estado", fetch = FetchType.EAGER)
	private List<Cidade> cidadesMunicipais;

	public List<Cidade> getCidadesMunicipais() {
		return cidadesMunicipais;
	}

	public void setCidadesMunicipais(List<Cidade> cidadesMunicipais) {
		this.cidadesMunicipais = cidadesMunicipais;
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