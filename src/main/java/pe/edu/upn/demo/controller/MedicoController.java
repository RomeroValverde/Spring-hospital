package pe.edu.upn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import pe.edu.upn.demo.model.entity.Medico;
import pe.edu.upn.demo.service.MedicoService;

@Controller
@RequestMapping("/medico")
public class MedicoController {
	@Autowired
	private MedicoService medicoService;
	
	@GetMapping
	public String inicio(Model model) {
		try {
			List<Medico> medicos = medicoService.findAll();
			model.addAttribute("medicos",medicos);
		} catch (Exception e) {
			
		}
		
		return "/medico/inicio";
	}
}
