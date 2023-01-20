package model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "cidades")
public class Cidade {
    @Id
    private UUID id;
    private String cidade;
    @ManyToOne
    private Estado estado;

    public Cidade() {}

    public Cidade(String cidade,
                  Estado estado) {
        this.cidade = cidade;
        this.estado = estado;
    }

    public void setId(UUID id) { this.id = id; }

    public UUID getId() { return this.id; }

    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getCidade() { return this.cidade; }

    @Override
    public boolean equals(Object obj) {

        Cidade other = (Cidade) obj;


        return super.equals(obj);
    }
    public static void exibirCidade(Cidade cidade) {
        System.out.println("Cidade\nNome: " + cidade.getCidade()
                + "\nEstado: " + cidade.estado.getEstado() + "\n");
    }
}
