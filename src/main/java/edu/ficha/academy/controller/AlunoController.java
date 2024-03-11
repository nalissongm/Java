package edu.ficha.academy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ficha.academy.model.AlunoModel;
import edu.ficha.academy.repository.AlunoRepository;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	public final AlunoRepository aluno;

	public AlunoController(AlunoRepository aluno) {
		this.aluno = aluno;
	}

	@PostMapping("/cadastrar")
	public void salvarAlunos(@RequestBody AlunoModel al) {
		aluno.save(al);
	}
	
	@GetMapping("/lista")
	public List<AlunoModel> listaAlunos(){
		return aluno.findAll();
	}
	
	@GetMapping("/nome/{nome}")
	public String retornarPorNome(@PathVariable("nome") String nome) {
		AlunoModel al = new AlunoModel();
		al = aluno.findByNome(nome);
		return "Nome: " + al.getNome() +   " | " +
				"Peso: " + al.getPeso() + " | " + "Altura: " + al.getAltura();
				
	}
	
	@GetMapping("/matricula/{matricula}")
	public String retornarPorid(@PathVariable("matricula") int matricula) {
		AlunoModel al = new AlunoModel();
		al = aluno.findByMatricula(matricula);
		return "Nome: " + al.getNome() +  " | " + " | " +
				"Peso: " + al.getPeso() + " | " + "Altura: " + al.getAltura();
	}
	
	@Transactional
	@PutMapping("/atualizar/objetivo/{objetivo}/{nome}")
	public void atualizarObjetivo(@PathVariable("objetivo") String objetivo,@PathVariable("nome") String nome) {
		aluno.atualizarObjetivo(objetivo, nome);
	}
	
	@Transactional
	@DeleteMapping("/deletar/{nome}")
	public void deletar(@PathVariable("nome") String nome) {
		aluno.deletarAluno(nome);
	}
	
	 
	
	
	
}
