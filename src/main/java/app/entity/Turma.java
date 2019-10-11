package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TURMA
 * @generated
 */
@Entity
@Table(name = "\"TURMA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Turma")
public class Turma implements Serializable {

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
  @Column(name = "disciplina", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String disciplina;

  /**
  * @generated
  */
  @Column(name = "horario", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String horario;

  /**
  * @generated
  */
  @Column(name = "local", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String local;

  /**
  * @generated
  */
  @Column(name = "alunos", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String alunos;

  /**
  * @generated
  */
  @Column(name = "aulas", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String aulas;

  /**
  * @generated
  */
  @Column(name = "media", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String media;

  /**
   * Construtor
   * @generated
   */
  public Turma(){
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
  public Turma setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém disciplina
   * return disciplina
   * @generated
   */
  
  public java.lang.String getDisciplina(){
    return this.disciplina;
  }

  /**
   * Define disciplina
   * @param disciplina disciplina
   * @generated
   */
  public Turma setDisciplina(java.lang.String disciplina){
    this.disciplina = disciplina;
    return this;
  }

  /**
   * Obtém horario
   * return horario
   * @generated
   */
  
  public java.lang.String getHorario(){
    return this.horario;
  }

  /**
   * Define horario
   * @param horario horario
   * @generated
   */
  public Turma setHorario(java.lang.String horario){
    this.horario = horario;
    return this;
  }

  /**
   * Obtém local
   * return local
   * @generated
   */
  
  public java.lang.String getLocal(){
    return this.local;
  }

  /**
   * Define local
   * @param local local
   * @generated
   */
  public Turma setLocal(java.lang.String local){
    this.local = local;
    return this;
  }

  /**
   * Obtém alunos
   * return alunos
   * @generated
   */
  
  public java.lang.String getAlunos(){
    return this.alunos;
  }

  /**
   * Define alunos
   * @param alunos alunos
   * @generated
   */
  public Turma setAlunos(java.lang.String alunos){
    this.alunos = alunos;
    return this;
  }

  /**
   * Obtém aulas
   * return aulas
   * @generated
   */
  
  public java.lang.String getAulas(){
    return this.aulas;
  }

  /**
   * Define aulas
   * @param aulas aulas
   * @generated
   */
  public Turma setAulas(java.lang.String aulas){
    this.aulas = aulas;
    return this;
  }

  /**
   * Obtém media
   * return media
   * @generated
   */
  
  public java.lang.String getMedia(){
    return this.media;
  }

  /**
   * Define media
   * @param media media
   * @generated
   */
  public Turma setMedia(java.lang.String media){
    this.media = media;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Turma object = (Turma)obj;
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
