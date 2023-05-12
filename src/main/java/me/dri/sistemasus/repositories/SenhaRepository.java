package me.dri.sistemasus.repositories;

import me.dri.sistemasus.entities.Senha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenhaRepository extends JpaRepository<Senha, Integer> {
}
