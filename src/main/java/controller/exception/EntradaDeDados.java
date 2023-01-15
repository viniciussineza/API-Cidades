package controller.exception;

public class EntradaDeDados extends RuntimeException {

    public EntradaDeDados (String mensagemDeErro) {
        super(mensagemDeErro);
    }

}
