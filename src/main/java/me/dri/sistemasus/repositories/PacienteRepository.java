package me.dri.sistemasus.repositories;

import me.dri.sistemasus.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
