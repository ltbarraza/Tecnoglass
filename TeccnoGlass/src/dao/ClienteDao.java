package dao;

import java.util.List;


import pojo.Cliente;

public interface ClienteDao {
	
	public void save(Cliente cliente);
	public void update(Cliente cliente);
	public void delete(Cliente cliente);
	public List<Cliente> findAll();
	public Cliente findById(int id);

}
