package dev.idaaalgo.CadastroDeNinjas.Ninjas.Repository;

import dev.idaaalgo.CadastroDeNinjas.Ninjas.Models.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
