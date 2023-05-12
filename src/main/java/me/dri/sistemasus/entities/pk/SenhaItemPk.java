package me.dri.sistemasus.entities.pk;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import me.dri.sistemasus.entities.Paciente;
import me.dri.sistemasus.entities.Senha;

import java.io.Serializable;


@Embeddable
public class SenhaItemPk  implements Serializable {

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @OneToOne
    @JoinColumn(name = "senha_id")
    private Senha senha;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }
}
