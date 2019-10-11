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
@Repository("AvaliacaoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AvaliacaoDAO extends JpaRepository<Avaliacao, java.lang.String> {

  /**
   * Obtém a instância de Avaliacao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Avaliacao entity WHERE entity.id = :id")
  public Avaliacao findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Avaliacao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Avaliacao entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM AlunoAvaliacaoNota entity WHERE entity.avaliacao.id = :id")
  public Page<AlunoAvaliacaoNota> findAlunoAvaliacaoNota(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.aluno FROM AlunoAvaliacaoNota entity WHERE entity.avaliacao.id = :id")
  public Page<Aluno> listAluno(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM AlunoAvaliacaoNota entity WHERE entity.avaliacao.id = :instanceId AND entity.aluno.id = :relationId")
  public int deleteAluno(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key turma
   * @generated
   */
  @Query("SELECT entity FROM Avaliacao entity WHERE entity.turma.id = :id")
  public Page<Avaliacao> findAvaliacaosByTurma(@Param(value="id") java.lang.String id, Pageable pageable);

}
