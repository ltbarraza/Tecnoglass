package service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.OrdenDao;
import pojo.Orden;

@Service
public class OrdenServiceImpl implements OrdenService {
	
	@Autowired
	private OrdenDao ordenDao;

	
	public List<Orden> findAll() {
		
		return ordenDao.findAll();
	}


	public void save(Orden orden) {
		
		orden.setFecha_orden(new Timestamp(new Date().getTime()));
		
		
		ordenDao.save(orden);
		
	}

	
	public Orden findById(int id) {
		
		return ordenDao.findById(id);
	}

	
	public void Aprobar(Orden orden) {
		
		ordenDao.Aprobar(orden);
		
	}

	

	



}
