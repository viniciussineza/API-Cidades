package view;

import controller.CidadeController;
import controller.exception.EntradaDeDados;
import controller.impl.CidadeArmazenamentoMemoriaController;
import model.*;

import java.util.List;
import java.util.Scanner;

public class CidadeView {

    private CidadeController controller = new CidadeArmazenamentoMemoriaController();

    private Scanner scan = new Scanner(System.in);

    public void cadastrar() {

        System.out.println("Informe o nome da cidade: ");
        String nomeDaCidade = scan.nextLine();

        System.out.println("Informe o estado da cidade: ");
        String nomeDoEstado = scan.nextLine();

        Cidade cidade = new Cidade(nomeDaCidade, nomeDoEstado);

        controller.cadastrar(cidade);
    }

    public void listar() {
        List<Cidade> cidades = controller.listar();
        for (int index = 0; index < cidades.size(); index++) {
            System.out.println((index + 1) + " - ");
            Cidade.exibirCidade(cidades.get(index));
        }
    }


    public void exibirMenu() {

        System.out.println("Escolha a opção desejada: ");
        System.out.println("1 - Cadastrar Cidade");
        System.out.println("2 - Listar Cidade");
        System.out.println("3 - Atualizar Cidade");
        System.out.println("4 - Excluir Cidade");
        System.out.println("0 - Encerrar");

        Integer opcao = 0;

        try {
            //Expected = No issue about buffer in cadastrar() method when using nextLine
            opcao = Integer.parseInt(scan.nextLine());
        } catch(Exception e) {
            if(opcao != 1 && opcao != 2 && opcao != 0) {
                throw new EntradaDeDados(e.getMessage());
            }
            System.out.println("Favor informar uma das opções");
            exibirMenu();
        }

        switch (opcao) {
            case 1:
                cadastrar();
                break;
            case 2:
                listar();
                break;
            case 3:
                System.out.println("Novidade na próxima versão!");
                break;
            case 4:
                System.out.println("Novidade na próxima versão!");
                break;
            case 0:
                System.out.println("Obrigado por usar o sistema");
                System.exit(0);
            default:
                System.out.println("Opção inválida");
        }
        exibirMenu();
    }
}
