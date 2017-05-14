package persistencia;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import beans.Estado;

public class EstadoDAO {

	public static Estado buscarPorNome(String nome) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Estado estado = null;
		try {
			Query consulta = sessao
					.createQuery("from Estado where nome = :paramNome");
			consulta.setString("paramNome", nome);
			estado = (Estado) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessao.close();
		}
		return estado;
	}

	@SuppressWarnings("unchecked")
	public static List<Estado> buscarTodosDados() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Estado> lista = null;
		try {
			Query consulta = sessao.createQuery("from Estado");
			lista = consulta.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessao.close();
		}
		return lista;
	}
}