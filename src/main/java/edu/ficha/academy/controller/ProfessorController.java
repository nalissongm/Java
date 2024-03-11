package edu.ficha.academy.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ficha.academy.model.ProfessorModel;
import edu.ficha.academy.repository.ProfessorRepository;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
	
	@Autowired
	ProfessorRepository professor;
	
	@PostMapping("/cadastrar")
	
	public void cadastrarProfessores(@RequestBody ProfessorModel prof) {
		professor.save(prof);
	}
	
	@GetMapping("/retornar/{matricula}")
	public ProfessorModel retornarPorMatricula(@PathVariable("matricula")int matricula) {
		return professor.findByMatricula(matricula);
	}
	
	@GetMapping("/retornar/{nome}")
	public ProfessorModel retornarPorNome(@PathVariable("nome")String nome) {
		return professor.findByNome(nome);
	}
	
	@Transactional
	@DeleteMapping("/deletar")
	public void deletarProfessor(String nome) {
		professor.deletarProfessor(nome);
	}

}
