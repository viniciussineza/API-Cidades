import controller.exception.EntradaDeDados;
import view.CidadeView;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Bem vindo ao cadastro de cidades!");
        menuPrincipal();

    }

    public static void menuPrincipal() {

        System.out.println("Digite uma das opções no menu abaixo:");
        System.out.println("1 - Menu Cidades");
        System.out.println("2 - Menu Estados");
        System.out.println("3 - Menu Países");
        System.out.println("0 - Encerrar o programa");

        Integer opcao = 0;

        try {
            //Expected = No issue about buffer in cadastrar() method when using nextLine
            opcao = Integer.parseInt(scan.nextLine());
        } catch(Exception e) {
            if(opcao != 1 && opcao != 2 && opcao != 0) {
                throw new EntradaDeDados(e.getMessage());
            }
            System.out.println("Favor informar uma das opções do menu");
            menuPrincipal();
        }

        switch (opcao) {
            case 1 -> {
                CidadeView app = new CidadeView();
                app.menuCidadeView();
            }
            case 2 -> System.out.println("Próxima versão!");
            case 3 -> System.out.println("Próxima versão");
            case 0 -> {
                System.out.println("Obrigado por usar o sistema");
                System.exit(0);
            }
            default -> System.out.println("Opção inválida");
        }
    }
}
