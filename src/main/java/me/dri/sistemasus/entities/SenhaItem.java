package me.dri.sistemasus.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import me.dri.sistemasus.entities.enums.TipoSenha;
import me.dri.sistemasus.entities.pk.SenhaItemPk;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class SenhaItem  implements Serializable {


    @EmbeddedId
    private SenhaItemPk id = new SenhaItemPk();

    private TipoSenha tipoSenha;

    public SenhaItem() {

    }

    public SenhaItem(Paciente paciente, Senha senha, TipoSenha tipoSenha) {
        id.setPaciente(paciente);
        id.setSenha(senha);
        this.tipoSenha = tipoSenha;
    }

    @JsonIgnore
    public Paciente getPaciente() {
        return id.getPaciente();
    }

    public void setPaciente(Paciente paciente) {
        id.setPaciente(paciente);
    }

    public Senha getSenha() {
        return id.getSenha();
    }

    public void setSenha(Senha senha) {
        id.setSenha(senha);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SenhaItem senhaItem = (SenhaItem) o;
        return Objects.equals(id, senhaItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
