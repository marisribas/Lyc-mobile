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
@Repository("AlunoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AlunoDAO extends JpaRepository<Aluno, java.lang.String> {

  /**
   * Obtém a instância de Aluno utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Aluno entity WHERE entity.id = :id")
  public Aluno findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Aluno utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Aluno entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM AlunoAvaliacaoNota entity WHERE entity.aluno.id = :id")
  public Page<AlunoAvaliacaoNota> findAlunoAvaliacaoNota(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.avaliacao FROM AlunoAvaliacaoNota entity WHERE entity.aluno.id = :id")
  public Page<Avaliacao> listAvaliacao(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM AlunoAvaliacaoNota entity WHERE entity.aluno.id = :instanceId AND entity.avaliacao.id = :relationId")
  public int deleteAvaliacao(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
