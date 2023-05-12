package me.dri.sistemasus.resources;


import me.dri.sistemasus.entities.Senha;
import me.dri.sistemasus.services.SenhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/senhas")
public class SenhaResource {


    @Autowired
    private SenhaService senhaService;


    @GetMapping
    public ResponseEntity<List<Senha>> findAll() {
        List<Senha> senhas = senhaService.findAll();
        return ResponseEntity.ok().body(senhas);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Senha> findById(@PathVariable Integer id) {
        Senha senha = senhaService.findById(id);
        return ResponseEntity.ok().body(senha);
    }

}
