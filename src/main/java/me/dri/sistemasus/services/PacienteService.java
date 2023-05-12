package me.dri.sistemasus.services;


import me.dri.sistemasus.entities.Paciente;
import me.dri.sistemasus.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    public Paciente findById(Integer id) {
        Optional<Paciente> obj = pacienteRepository.findById(id);
        return obj.get();
    }
}
