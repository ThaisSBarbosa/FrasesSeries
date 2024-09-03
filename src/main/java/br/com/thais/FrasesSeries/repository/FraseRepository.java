package br.com.thais.FrasesSeries.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.thais.FrasesSeries.model.Frase;

public interface FraseRepository extends JpaRepository<Frase, Long> {
	@Query("select f from Frase f order by function('random') limit 1")
	Frase retornaFraseAleatoria();
}
