package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;


/**
 * Classe que representa a tabela ALUNO
 * @generated
 */
@Entity
@Table(name = "\"ALUNO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Aluno")
public class Aluno implements Serializable {

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
  @Column(name = "foto", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="LjjFEx-qJeUAAAAAAAACxGexOGcezJcZ-Ak4u0vv1jwP6iqWl6mVHxbVnbnpUDam")
  
  private java.lang.String foto;

  /**
   * Construtor
   * @generated
   */
  public Aluno(){
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
  public Aluno setId(java.lang.String id){
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
  public Aluno setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém foto
   * return foto
   * @generated
   */
  
  public java.lang.String getFoto(){
    return this.foto;
  }

  /**
   * Define foto
   * @param foto foto
   * @generated
   */
  public Aluno setFoto(java.lang.String foto){
    this.foto = foto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Aluno object = (Aluno)obj;
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
