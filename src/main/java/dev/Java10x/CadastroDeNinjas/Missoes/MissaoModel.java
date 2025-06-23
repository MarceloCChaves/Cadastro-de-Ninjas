package dev.Java10x.CadastroDeNinjas.Missoes;

import java.util.List;

import dev.Java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int Id;

  private String nome;

  private String dificuldade;

  // Uma missão pode ter vários ninjas
  @OneToMany(mappedBy = "missoes")
  private List<NinjaModel> ninjas;

  public MissaoModel() {

  }

  public MissaoModel(String nome, String dificuldade) {
    this.nome = nome;
    this.dificuldade = dificuldade; 
  }

  public String getNomeMissao() {
    return nome;
  }

  public void setNomeMissao(String nome) {
    this.nome = nome;
  }

  public String getDificuldade() {
    return dificuldade;
  }

  public void setDificuldade(String dificuldade) {
    this.dificuldade = dificuldade;
  }
}
