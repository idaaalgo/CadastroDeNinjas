package dev.idaaalgo.CadastroDeNinjas.Missoes.Repository;

import dev.idaaalgo.CadastroDeNinjas.Missoes.Models.MissaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissaoRepository extends JpaRepository<MissaoModel, Long> {
}
