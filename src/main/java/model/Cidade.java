package model;

import java.util.*;

public class Cidade {

    private UUID id;
    private String nomeDaCidade;
    private String nomeDoEstado;

    public Cidade() {}

    public void setId(UUID id) { this.id = id; }

    public UUID getId() { return this.id; }

    public void setNomeDaCidade(String nomeDaCidade) { this.nomeDaCidade = nomeDaCidade; }

    public String getNomeDaCidade() { return this.nomeDaCidade; }

    public void setNomeDoEstado(String nomeDoEstado) { this.nomeDoEstado = nomeDoEstado; }

    public String getNomeDoEstado() { return this.nomeDoEstado; }


}
