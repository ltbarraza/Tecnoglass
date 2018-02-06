package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EstadoDao;
import pojo.Estado;

@Service
public class EstadoServiceImpl implements EstadoService {
	
	@Autowired
	private EstadoDao estadoDao;
	
	

	
	public Estado findByIdEstado(int id) {
		
		return estadoDao.findByIdEstado(id);
	}

}
