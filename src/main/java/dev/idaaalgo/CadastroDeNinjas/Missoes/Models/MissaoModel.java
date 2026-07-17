package dev.idaaalgo.CadastroDeNinjas.Missoes.Models;

import dev.idaaalgo.CadastroDeNinjas.Ninjas.Models.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    // One = missao / ToMany = ninjas
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;

}
