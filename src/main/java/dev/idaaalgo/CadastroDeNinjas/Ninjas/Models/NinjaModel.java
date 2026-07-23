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
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true, name = "email")
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    @ManyToOne // Many = ninjas / ToOne = missao
    @JoinColumn(name = "missao_id")
    private MissaoModel missao;

}
