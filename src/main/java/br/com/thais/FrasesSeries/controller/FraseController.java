package br.com.thais.FrasesSeries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thais.FrasesSeries.dto.FraseDTO;
import br.com.thais.FrasesSeries.service.FraseService;

@RestController
public class FraseController {
	@Autowired
	private FraseService servico;
	
	@GetMapping("/series/frases")
	public FraseDTO obtemFraseAleatoria() {
		return servico.obtemFraseAleatoria();
	}
}
