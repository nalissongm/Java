package edu.ficha.academy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ficha.academy.model.AlunoModel;
import edu.ficha.academy.repository.AlunoRepository;



@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	public AlunoRepository aluno;
	
	@PostMapping("/cadastrar")
	public void salvarAlunos(@RequestBody List<AlunoModel> alunos) {
		aluno.saveAll(alunos);
	}
	
	@GetMapping("/nome/{nome}")
	public String retornarPorNome(@PathVariable("nome") String nome) {
		AlunoModel al = new AlunoModel();
		al = aluno.findByNome(nome);
		return "Nome: " + al.getNome() +  " | " + "Objetivo: " + al.getObjetivo() + " | " +
				"Peso: " + al.getPeso() + " | " + "Altura: " + al.getAltura();
				
	}
	
	@GetMapping("/matricula/{matricula}")
	public String retornarPorid(@PathVariable("matricula") int matricula) {
		AlunoModel al = new AlunoModel();
		al = aluno.findByMatricula(matricula);
		return "Nome: " + al.getNome() +  " | " + "Objetivo: " + al.getObjetivo() + " | " +
				"Peso: " + al.getPeso() + " | " + "Altura: " + al.getAltura();
	}
	
	@PutMapping("/atualizar/objetivo/{objetivo}/{nome}")
	public void atualizarObjetivo(@PathVariable("objetivo") String objetivo,@PathVariable("nome") String nome) {
		aluno.atualizarObjetivo(objetivo, nome);
	}
	
	@PutMapping("/atualizar/nome/{novoNome}/{nome}")
	public void atualizarNome(@PathVariable("novoNome") String novoNome,@PathVariable("nome") String nome) {
		aluno.atualizarNome(novoNome, nome);
	}
	
	
	
	
	
}
