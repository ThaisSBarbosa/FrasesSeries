package br.com.thais.FrasesSeries.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.thais.FrasesSeries.dto.FraseDTO;
import br.com.thais.FrasesSeries.model.Frase;
import br.com.thais.FrasesSeries.repository.FraseRepository;

@Service
public class FraseService {
	@Autowired
	private FraseRepository repositorio;
	
	public FraseDTO obtemFraseAleatoria() {
		return converteDados(repositorio.retornaFraseAleatoria());
	}
	
	private FraseDTO converteDados(Frase frase){
		return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
	}
}
