package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import pojo.Cliente;
import service.ClienteService;



@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	
	@RequestMapping("/clientes")
	public String allClientes(Model model) {
		
		Cliente cliente = new Cliente();
		List<Cliente> clientes = clienteService.findAll();
		
		model.addAttribute("cliente", cliente);
		model.addAttribute("clientes", clientes);
		
		return "cliente";
	}
	
	
	@RequestMapping("/cliente/CRUD//{idAd}")
	public String CrudCliente(Model model, @PathVariable("idAd") int id) {
		
		if(id == 0){
			
			Cliente cliente = new Cliente();
			model.addAttribute("cliente", cliente);
			
		}else {
			
			Cliente cliente = clienteService.findById(id);
			model.addAttribute("cliente", cliente);
			
		}
		
		return "CRUD";
	}
	
	@RequestMapping(value = "/cliente/SaveUpdate", method = RequestMethod.POST)
	public String SaveUpdate(@ModelAttribute("admin") Cliente cliente, Model model, RedirectAttributes ra) {
		
		clienteService.save(cliente);
		
		return "redirect:/clientes";
	}
	
	@RequestMapping("/cliente/delete/{idAd}")
	public String delete(@PathVariable("idAd") int id, RedirectAttributes ra) {
		
		clienteService.delete(id);
		
		return "redirect:/clientes";

	}
	
	
}
