package edu.ficha.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.ficha.academy.model.ProfessorModel;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorModel, Integer > {

		public ProfessorModel findByMatricula(int matricula);
		
		public ProfessorModel findByNome(String nome);
		
		@Modifying
		@Query("delete from ProfessorModel p where p.nome = :nome")
		public void deletarProfessor(@Param("nome") String nome);
	
	
	

}
