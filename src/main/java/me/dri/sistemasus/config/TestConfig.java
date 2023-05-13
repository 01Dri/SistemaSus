package me.dri.sistemasus.config;


import me.dri.sistemasus.entities.Guiche;
import me.dri.sistemasus.entities.Paciente;
import me.dri.sistemasus.entities.Senha;
import me.dri.sistemasus.entities.enums.TipoSenha;
import me.dri.sistemasus.repositories.GuicheRepository;
import me.dri.sistemasus.repositories.PacienteRepository;
import me.dri.sistemasus.repositories.SenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.Date;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {


    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private SenhaRepository senhaRepository;

    @Autowired
    private GuicheRepository guicheRepository;

    @Override
    public void run(String... args) throws Exception {

        Paciente paciente = new Paciente(null, "Diego Henrique", "9999999", new Date());
        Paciente paciente2 = new Paciente(null, "Melanie Kamiski", "9999999", new Date());

        pacienteRepository.save(paciente);
        pacienteRepository.save(paciente2);

        Senha senha = new Senha(null, TipoSenha.N);
        Senha senha2 = new Senha(null, TipoSenha.P);
        Senha senha3 = new Senha(null, TipoSenha.N);

        senha.setPaciente(paciente);
        senha2.setPaciente(paciente2);
        //senhaRepository.save(senha);
        //senhaRepository.save(senha2);
        senhaRepository.saveAll(Arrays.asList(senha, senha2, senha3));

        paciente.setSenha(senha);
        //paciente2.setSenha(senha2);
        pacienteRepository.save(paciente);
        pacienteRepository.save(paciente2);

        Guiche guiche1 = new Guiche(null);
        Guiche guiche2 = new Guiche(null);
        Guiche guiche3 = new Guiche(null);
        guiche1.setSenha(senha);

        guicheRepository.save(guiche1);
        guicheRepository.save(guiche2);
        guicheRepository.save(guiche3);

        senha.setGuiche(guiche1);
        senha2.setGuiche(guiche3);
        senha3.setGuiche(guiche2);
        senhaRepository.save(senha);
        senhaRepository.save(senha2);
        senhaRepository.save(senha3);




    }
}
