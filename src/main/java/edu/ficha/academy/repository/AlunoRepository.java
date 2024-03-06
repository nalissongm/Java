package edu.ficha.academy.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.ficha.academy.model.AlunoModel;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Integer> {

	public AlunoModel findByNome(String nome);
	
	public AlunoModel findByMatricula(int id);
	
	@Modifying
	@Query("update AlunoModel a set a.objetivo = :objetivo where a.nome =:nome ")
	public void atualizarObjetivo(@Param("objetivo") String objetivo, @Param("nome") String nome);
	
	@Modifying
	@Query("delete from AlunoModel a where a.nome = :nome")
	public void deletarAluno(@Param("nome") String nome);
	


}
