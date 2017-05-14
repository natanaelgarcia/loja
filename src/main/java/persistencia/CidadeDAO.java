package persistencia;

import org.hibernate.Query;
import org.hibernate.Session;

import beans.Cidade;

public class CidadeDAO {

	public static Cidade pesquisarPorNome(String nome) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Cidade cidade = null;
		try {
			Query consulta = sessao
					.createQuery("from Cidade where nome = :paramNome");
			consulta.setString("paramNome", nome);
			cidade = (Cidade) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessao.close();
		}
		return cidade;
	}
}