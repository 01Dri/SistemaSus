package me.dri.sistemasus.services;


import me.dri.sistemasus.entities.Senha;
import me.dri.sistemasus.repositories.SenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SenhaService {

    @Autowired
    private SenhaRepository senhaRepository;

    public List<Senha> findAll() {
        return senhaRepository.findAll();
    }

    public Senha findById(Integer id) {
        Optional<Senha> senha = senhaRepository.findById(id);
        return senha.get();
    }
}
