package model;

import java.util.UUID;

public class Pais {

    private UUID id;
    private String nome;
    private String siglaPais;

    public Pais() {}

    public Pais(UUID id, String pais, String siglaPais) {
        this.id = id;
        this.nome = pais;
        this.siglaPais = siglaPais;
    }
}
