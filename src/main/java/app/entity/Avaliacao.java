package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela AVALIACAO
 * @generated
 */
@Entity
@Table(name = "\"AVALIACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Avaliacao")
public class Avaliacao implements Serializable {

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
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_turma", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Turma turma;

  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Column(name = "ordem", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer ordem;

  /**
   * Construtor
   * @generated
   */
  public Avaliacao(){
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
  public Avaliacao setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Avaliacao setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém turma
   * return turma
   * @generated
   */
  
  public Turma getTurma(){
    return this.turma;
  }

  /**
   * Define turma
   * @param turma turma
   * @generated
   */
  public Avaliacao setTurma(Turma turma){
    this.turma = turma;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public Avaliacao setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém ordem
   * return ordem
   * @generated
   */
  
  public java.lang.Integer getOrdem(){
    return this.ordem;
  }

  /**
   * Define ordem
   * @param ordem ordem
   * @generated
   */
  public Avaliacao setOrdem(java.lang.Integer ordem){
    this.ordem = ordem;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Avaliacao object = (Avaliacao)obj;
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
