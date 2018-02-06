package service;

import java.util.List;

import pojo.Orden;

public interface OrdenService {
	
	public List<Orden> findAll();
	public void save(Orden orden);
	public  Orden findById(int id);
	public void Aprobar(Orden orden);



}
