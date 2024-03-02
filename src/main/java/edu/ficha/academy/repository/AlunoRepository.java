package edu.ficha.academy.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.ficha.academy.model.AlunoModel;
import jakarta.transaction.Transactional;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Integer> {

	public AlunoModel findByNome(String nome);
	
	public AlunoModel findByMatricula(int id);
	
	@Transactional
	@Modifying
	@Query("update AlunoModel a set a.objetivo = :objetivo where a.nome =:nome ")
	public void atualizarObjetivo(@Param("objetivo") String objetivo, @Param("nome") String nome);
	
	@Transactional
	@Modifying
	@Query("update AlunoModel a set a.nome =:novoNome where a.nome =:nome")
	public void atualizarNome(@Param("novoNome") String novoNome, @Param("nome") String nome);


}
