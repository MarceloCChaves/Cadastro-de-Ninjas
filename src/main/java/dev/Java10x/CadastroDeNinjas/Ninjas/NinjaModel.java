package dev.Java10x.CadastroDeNinjas.Ninjas;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Transformar uma classe em uma entidade no Banco de dados.
@Entity
@Table(name = "tb_cadastro_de_ninjas")
public class NinjaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String email;
  private int idade;
  //private List<Missoes> missoes;

  public NinjaModel() {

  }

  public NinjaModel(String nome, String email, int idade) {
    this.nome = nome;
    this.email = email;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
