package edu.ficha.academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ficha.academy.model.AlunoModel;
import edu.ficha.academy.repository.AlunoRepository;

@Service
public class AlunoService {

		@Autowired
		AlunoRepository aluno;
		
		public void salvarAluno(AlunoModel aluno) {
			this.aluno.save(aluno);
			
		}
		
		public AlunoModel retornarAlunoPeloNome(String nome) {
			AlunoModel alunoSelecionado = new AlunoModel();
			for(AlunoModel o : aluno.findAll()) {
				if(nome.equals(o.getNome())) {
					alunoSelecionado = o;
				}
			}
			
			return alunoSelecionado;
		}
		
		public List<AlunoModel> retornarListaAlunos(){
			return aluno.findAll();
		}
}
