package edu.ficha.academy.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.ficha.academy.model.AlunoModel;
import edu.ficha.academy.repository.AlunoRepository;

// Classe utilizada para rodar a aplicação.

@Component
public class AapStart implements CommandLineRunner {
	
	@Autowired
	private AlunoRepository repository;
	

	
	
	@Override
	public void run(String... args) throws Exception {
		
		AlunoModel aluno1 = new AlunoModel();
		aluno1.setId(9467);
		aluno1.setNome("Herick");
		aluno1.setEmail("herick@example.com");
		aluno1.setAltura(1.70);
		aluno1.setPeso(70);
		aluno1.setObjetivo("Ganho de massa");
		
		AlunoModel aluno2 = new AlunoModel();
		aluno2.setId(3546);
		aluno2.setNome("Roberto");
		aluno2.setEmail("roberto@example.com");
		aluno2.setAltura(1.90);
		aluno2.setPeso(66);
		aluno2.setObjetivo("Ganho de massa");
		
		repository.save(aluno1);
		repository.save(aluno2);
	
	}
	

}
