package me.dri.sistemasus.config;


import me.dri.sistemasus.entities.Paciente;
import me.dri.sistemasus.entities.Senha;
import me.dri.sistemasus.entities.enums.TipoSenha;
import me.dri.sistemasus.repositories.PacienteRepository;
import me.dri.sistemasus.repositories.SenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Date;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {


    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private SenhaRepository senhaRepository;

    @Override
    public void run(String... args) throws Exception {

        Paciente paciente = new Paciente(null, "Diego Henrique", "9999999", new Date());
        Paciente paciente2 = new Paciente(null, "Melanie Kamiski", "9999999", new Date());

        pacienteRepository.save(paciente);
        pacienteRepository.save(paciente2);

        Senha senha = new Senha(null, TipoSenha.NORMAL);
        senha.setPaciente(paciente);
        senhaRepository.save(senha);

        paciente.setSenha(senha);
        pacienteRepository.save(paciente);


    }
}
