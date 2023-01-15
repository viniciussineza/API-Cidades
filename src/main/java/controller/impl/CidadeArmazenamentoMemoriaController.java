package controller.impl;

import controller.CidadeController;
import model.Cidade;
import java.util.*;


public class CidadeArmazenamentoMemoriaController implements CidadeController {

    private Map<UUID, Cidade> cidades = new HashMap<>();

    @Override
    public void cadastrar(Cidade cidade) {
        cidade.setId(UUID.randomUUID());
        cidades.put(cidade.getId(), cidade);
        System.out.println("Cidade cadastrada com sucesso: " + cidade.getNomeDaCidade() + ", " + cidade.getNomeDoEstado());
    }

    @Override
    public List<Cidade> listar() {
        return cidades.values().stream().toList();
    }
}
