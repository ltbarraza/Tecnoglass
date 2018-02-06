package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional 
@Repository		
public class ItemDaoImpl implements ItemDao {
	
	@Autowired 
	private SessionFactory sessionFactory;
	
	
	public Session getSession(){
		
		return sessionFactory.getCurrentSession();
		
	}

}
