package edu.ficha.academy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ficha.academy.model.AlunoModel;
import edu.ficha.academy.service.AlunoService;



@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	AlunoService alunoService;
	
	
	@PostMapping("/salvar")
	public void salvarAluno(@RequestBody AlunoModel aluno) {
		alunoService.salvarAluno(aluno);
	}
	
	@GetMapping("/{nome}")
	public AlunoModel retornarAluno(@PathVariable("nome") String nome) {
		return alunoService.retornarAlunoPeloNome(nome);
	}

	@GetMapping("/lista")
	public List<AlunoModel> retornarAlunos(){
		return alunoService.retornarListaAlunos();
		
	}
	
}
