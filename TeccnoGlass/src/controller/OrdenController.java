package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pojo.Cliente;
import pojo.Estado;
import pojo.Orden;
import service.ClienteService;
import service.EstadoService;
import service.OrdenService;

@Controller
public class OrdenController {

	@Autowired
	private OrdenService ordenService;

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private EstadoService estadoService;

	@RequestMapping("/orden")
	public String InsertOrden(Model model) {

		Orden orden = new Orden();
		List<Cliente> clientes = clienteService.findAll();
		Estado estado = estadoService.findByIdEstado(1);

		model.addAttribute("orden", orden);
		model.addAttribute("clientes", clientes);
		model.addAttribute("estado", estado);

		return "orden";
	}

	@RequestMapping("/ordenes")
	public String AllOrden(Model model) {

		
		List<Orden> ordens = ordenService.findAll();

		model.addAttribute("ordens", ordens);

		return "ordenes";
	}

	@RequestMapping(value = "/orden/SaveOrden", method = RequestMethod.POST)
	public String SaveOrden(@ModelAttribute("orden") Orden orden) {

		ordenService.save(orden);

		return "redirect:/ordenes";
	}

	@RequestMapping("/orden/aprobar/{idAd}")
	public String Aprobar(Model model, @PathVariable("idAd") int id) {
		
		Orden orden = ordenService.findById(id);
		ordenService.Aprobar(orden);
		
		return "redirect:/ordenes";
	}

	@RequestMapping("/orden/cancelar/{idAd}")
	public String Anular(Model model, @PathVariable("idAd") int id) {
		
		Orden orden = ordenService.findById(id);
		
		ordenService.Aprobar(orden);

		return "redirect:/ordenes";

	}
}