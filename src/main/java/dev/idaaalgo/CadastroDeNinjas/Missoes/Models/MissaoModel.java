package dev.idaaalgo.CadastroDeNinjas.Missoes.Models;

import dev.idaaalgo.CadastroDeNinjas.Ninjas.Models.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missao") // One = missao / ToMany = ninjas
    private List<NinjaModel> ninjas;

}
