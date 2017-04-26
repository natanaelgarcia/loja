package beans;

import javax.persistence.*;

@Entity
@Table(name = "forma_pgto")
public class FormaPgto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fpg_id")
	private int id;
	@Column(name = "fpg_descricao", length = 20, nullable = true)
	private String descricao;
	@Column(name = "fpg_num_max_parc", nullable = true)
	private String numMaxParc;
	@Column(name = "fpg_num_padrao_parc", nullable = true)
	private String numPadraoParc;
	@Column(name = "fpg_intervalo_dias", nullable = true)
	private String intervaloDias;
	@Column(name = "fpg_percentual_acres", nullable = true)
	private String percentualAcres;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNumMaxParc() {
		return numMaxParc;
	}
	public void setNumMaxParc(String numMaxParc) {
		this.numMaxParc = numMaxParc;
	}
	public String getNumPadraoParc() {
		return numPadraoParc;
	}
	public void setNumPadraoParc(String numPadraoParc) {
		this.numPadraoParc = numPadraoParc;
	}
	public String getIntervaloDias() {
		return intervaloDias;
	}
	public void setIntervaloDias(String intervaloDias) {
		this.intervaloDias = intervaloDias;
	}
	public String getPercentualAcres() {
		return percentualAcres;
	}
	public void setPercentualAcres(String percentualAcres) {
		this.percentualAcres = percentualAcres;
	}
}
