package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ALUNOAVALIACAONOTA
 * @generated
 */
@Entity
@Table(name = "\"ALUNOAVALIACAONOTA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.AlunoAvaliacaoNota")
public class AlunoAvaliacaoNota implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_aluno", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Aluno aluno;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_avaliacao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Avaliacao avaliacao;

  /**
  * @generated
  */
  @Column(name = "nota", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nota;

  /**
   * Construtor
   * @generated
   */
  public AlunoAvaliacaoNota(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public AlunoAvaliacaoNota setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém aluno
   * return aluno
   * @generated
   */
  
  public Aluno getAluno(){
    return this.aluno;
  }

  /**
   * Define aluno
   * @param aluno aluno
   * @generated
   */
  public AlunoAvaliacaoNota setAluno(Aluno aluno){
    this.aluno = aluno;
    return this;
  }

  /**
   * Obtém avaliacao
   * return avaliacao
   * @generated
   */
  
  public Avaliacao getAvaliacao(){
    return this.avaliacao;
  }

  /**
   * Define avaliacao
   * @param avaliacao avaliacao
   * @generated
   */
  public AlunoAvaliacaoNota setAvaliacao(Avaliacao avaliacao){
    this.avaliacao = avaliacao;
    return this;
  }

  /**
   * Obtém nota
   * return nota
   * @generated
   */
  
  public java.lang.String getNota(){
    return this.nota;
  }

  /**
   * Define nota
   * @param nota nota
   * @generated
   */
  public AlunoAvaliacaoNota setNota(java.lang.String nota){
    this.nota = nota;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    AlunoAvaliacaoNota object = (AlunoAvaliacaoNota)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
