package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pojo.Cliente;
import pojo.Estado;


@Transactional 
@Repository	
public class EstadoDaoImpl implements EstadoDao{
	
	@Autowired 
	private SessionFactory sessionFactory;
	
	
	public Session getSession(){
		
		return sessionFactory.getCurrentSession();
		
	}


	public Estado findByIdEstado(int id) {
		
		return (Estado) getSession().createQuery("From Estado where idEstado = :idEstado")
				.setParameter("idEstado", id).getSingleResult();
	}

}
