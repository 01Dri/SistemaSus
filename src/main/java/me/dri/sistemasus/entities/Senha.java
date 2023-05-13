package me.dri.sistemasus.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import me.dri.sistemasus.entities.enums.TipoSenha;



@Entity
@Table(name = "Senhas")
public class Senha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Enumerated(EnumType.STRING)
    private TipoSenha tipoSenha;


    //@JsonIgnore
    //@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "paciente_id")


    @JsonIgnore
    @OneToOne

    private Paciente paciente;


    @OneToOne
    private Guiche guiche;


    public Senha() {

    }

    public Senha(Integer id, TipoSenha tipoSenha) {
        this.id = id;
        this.tipoSenha = tipoSenha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoSenha getTipoSenha() {
        return tipoSenha;
    }

    public void setTipoSenha(TipoSenha tipoSenha) {
        this.tipoSenha = tipoSenha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Guiche getGuiche() {
        return guiche;
    }

    public void setGuiche(Guiche guiche) {
        this.guiche = guiche;
    }
}

