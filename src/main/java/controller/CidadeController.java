package controller;

import model.Cidade;
import java.util.*;

public interface CidadeController {

    void cadastrar(Cidade cidade);

    List<Cidade> listar();

}
