package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ClienteDao;
import pojo.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteDao clienteDao;

	
	public List<Cliente> findAll() {
		
		return clienteDao.findAll();
	}

	
	public Cliente findById(int id) {
		
		return clienteDao.findById(id);
	}

	
	public void save(Cliente cliente) {
		
		if (cliente.getIdCliente() == 0) {
			
			clienteDao.save(cliente);
			
		}else{
			
			clienteDao.update(cliente);
		}
				
	}

	
	public void delete(int id) {
		
		Cliente cliente = clienteDao.findById(id);
		
		clienteDao.delete(cliente);
	}

}
