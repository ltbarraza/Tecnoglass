package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pojo.Orden;

@Transactional
@Repository
public class OrdenDaoImpl implements OrdenDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {

		return sessionFactory.getCurrentSession();

	}

	@SuppressWarnings("unchecked")
	public List<Orden> findAll() {

		return getSession().createQuery("select orden from Orden orden join orden.cliente cliente").list();
	}

	
	public void save(Orden orden) {

		getSession().save(orden);

	}

	
	public Orden findById(int id) {

		return (Orden) getSession().createQuery("From Cliente where idCliente = :idCliente")
				.setParameter("idCliente", id).getSingleResult();
	}

	
	public void Aprobar(Orden orden) {

		
		

	}

}
