package model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "estados")
public class Estado {

    @Id
    private UUID id;
    private String estado;
    private String siglaEstado;
    private Pais pais;

    public Estado() {}

    public Estado(UUID id, String estado, String siglaEstado, Pais pais) {
        this.id = id;
        this.estado = estado;
        this.siglaEstado = siglaEstado;
        this.pais = pais;
    }

    public void setEstado(String estado) { this.estado = estado; }

    public String getEstado() { return this.estado; }

}
