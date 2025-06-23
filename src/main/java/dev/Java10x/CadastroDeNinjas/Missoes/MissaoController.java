package dev.Java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissaoController {
  @GetMapping("/boas-vindas")
  public String boasVindas(){
    return "Essa é a primeira mensagem";
  }
}
