package negocio;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.*;
import persistencia.PessoaDAO;
import beans.Fone;
import beans.Pessoa;

@ManagedBean(name = "viewPessoas")
@SessionScoped
public class PessoaCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	private Pessoa pessoa;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getListagem() {
		return PessoaDAO.listagem("");
	}

	public String actionGravar() {
		if (pessoa.getId() == 0) {
			PessoaDAO.inserir(pessoa);
			return actionInserir();
		} else {
			PessoaDAO.alterar(pessoa);
			return "admin/lista_cliente";
		}
	}

	public String actionInserir() {
		pessoa = new Pessoa();
		return "publico/form_pessoa";
	}

	public String actionExcluir(Pessoa p) {
		PessoaDAO.excluir(p);
		return "admin/lista_cliente";
	}

	public String actionAlterar(Pessoa p) {
		pessoa = p;
		return "publico/form_pessoa";
	}
	
	public String actionInserirFone() {
		Fone fone = new Fone();
		fone.setPessoa(pessoa);
		pessoa.getFones().add(fone);
		return "publico/form_cliente";
	}
	
	public String actionListaPessoa(Pessoa p) {
		pessoa = p;
		return "admin/lista_cliente";
	}
}