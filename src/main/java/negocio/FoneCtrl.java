package negocio;

import javax.faces.bean.*;

import persistencia.FoneDAO;
import beans.Fone;
import beans.Pessoa;

@ManagedBean (name = "viewFones")
@SessionScoped
public class FoneCtrl {

	private Pessoa pessoa;
	private Fone fone;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String actionExcluirFone(Fone fone) {
		FoneDAO.excluir(fone);
		return "form_pessoa?faces-redirect=true";
	}

	public Fone getFone() {
		return fone;
	}

	public void setFone(Fone fone) {
		this.fone = fone;
	}
	
}
