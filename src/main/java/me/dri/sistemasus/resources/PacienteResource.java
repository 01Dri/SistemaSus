package me.dri.sistemasus.resources;


import me.dri.sistemasus.entities.Paciente;
import me.dri.sistemasus.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteResource {


    @Autowired
    private PacienteService pacienteService;


    @GetMapping
    public ResponseEntity<List<Paciente>> findAll() {
        List<Paciente> pacientes = pacienteService.findAll();
        return ResponseEntity.ok().body(pacientes);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Paciente> findById(@PathVariable Integer id) {
        Paciente paciente = pacienteService.findById(id);
        return ResponseEntity.ok().body(paciente);
    }




}
