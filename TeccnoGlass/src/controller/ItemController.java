package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.Item;

@Controller
public class ItemController {
	
	@RequestMapping("/item")
	public String InsertItem(Model model) {
		
		model.addAttribute("item",new Item());
		
		return "Item";
	}

}
