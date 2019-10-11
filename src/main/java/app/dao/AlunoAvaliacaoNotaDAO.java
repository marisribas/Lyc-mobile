package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("AlunoAvaliacaoNotaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AlunoAvaliacaoNotaDAO extends JpaRepository<AlunoAvaliacaoNota, java.lang.String> {

  /**
   * Obtém a instância de AlunoAvaliacaoNota utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM AlunoAvaliacaoNota entity WHERE entity.id = :id")
  public AlunoAvaliacaoNota findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de AlunoAvaliacaoNota utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM AlunoAvaliacaoNota entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key aluno
   * @generated
   */
  @Query("SELECT entity FROM AlunoAvaliacaoNota entity WHERE entity.aluno.id = :id")
  public Page<AlunoAvaliacaoNota> findAlunoAvaliacaoNotasByAluno(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key avaliacao
   * @generated
   */
  @Query("SELECT entity FROM AlunoAvaliacaoNota entity WHERE entity.avaliacao.id = :id")
  public Page<AlunoAvaliacaoNota> findAlunoAvaliacaoNotasByAvaliacao(@Param(value="id") java.lang.String id, Pageable pageable);

}
