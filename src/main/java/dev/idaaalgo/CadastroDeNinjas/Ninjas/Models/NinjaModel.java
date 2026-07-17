package dev.idaaalgo.CadastroDeNinjas.Ninjas.Models;

import dev.idaaalgo.CadastroDeNinjas.Missoes.Models.MissaoModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_ninjas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;

    @ManyToOne // Many = ninjas / ToOne = missao
    @JoinColumn(name = "missao_id")
    private MissaoModel missao;

}
