package service;

import java.util.List;
import pojo.Cliente;

public interface ClienteService {
	
	public void save(Cliente cliente);
	public void delete(int id);
	public List<Cliente> findAll();
	public Cliente findById(int id);

}
