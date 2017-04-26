package negocio;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.*;
import persistencia.ProdutoDAO;
import beans.Produto;

@ManagedBean(name = "viewProdutos")
@SessionScoped
public class ProdutoCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	private Produto produto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getListagem() {
		return ProdutoDAO.listagem("");
	}

	public String actionGravar() {
		if (produto.getId() == 0) {
			ProdutoDAO.inserir(produto);
			return actionInserir();
		} else {
			ProdutoDAO.alterar(produto);
			return "lista_produto";
		}
	}

	public String actionInserir() {
		produto = new Produto();
		return "form_produto";
	}

	public String actionExcluir(Produto p) {
		ProdutoDAO.excluir(p);
		return "lista_produto";
	}

	public String actionAlterar(Produto p) {
		produto = p;
		return "form_produto";
	}

}
