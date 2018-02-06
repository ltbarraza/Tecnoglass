package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pojo.Cliente;

@Transactional 
@Repository		
public class ClienteDaoImpl implements ClienteDao {
	
	@Autowired 
	private SessionFactory sessionFactory;
	

	public Session getSession(){
		
		return sessionFactory.getCurrentSession();
		
	}

	
	@SuppressWarnings("unchecked")
	public List<Cliente> findAll() {
		
		return getSession().createQuery("from Cliente").list(); 
	}


	public Cliente findById(int id) {
		
		return (Cliente) getSession().createQuery("From Cliente where idCliente = :idCliente")
				.setParameter("idCliente", id).getSingleResult();
	}

	
	public void save(Cliente cliente) {
	
		getSession().save(cliente);
		
	}

	
	public void update(Cliente cliente) {
		
		getSession().update(cliente);
			
	}

	
	public void delete(Cliente cliente) {
	
		getSession().delete(cliente);
	}

}
