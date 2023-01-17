package model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "estados")
public class Estado {

    @Id
    private UUID id;
    private String estado;

    public Estado() {}

    public Estado(UUID id, String estado) {
        this.id = id;
        this.estado = estado; }

    public void setEstado(String estado) { this.estado = estado; }

    public String getEstado() { return this.estado; }

}
