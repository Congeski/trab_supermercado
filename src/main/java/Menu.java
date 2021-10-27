import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void menuInicial() {

            System.out.println("\n\n## Sistema de controle Supermercado ##");
            System.out.println();

            System.out.println("  ----------------------");
            System.out.println(" |     1 - GERENTE      |");
            System.out.println(" |     2 - VENDEDOR     |");
            System.out.println(" |     3 - CLIENTE      |");
            System.out.println(" |     0 - SAIR         |");
            System.out.println("  ----------------------");

            System.out.print("Digite opção desejada: ");
            int opcao = sc.nextInt();
            System.out.printf("Opção Escolhida: %d", opcao);
            System.out.println();

            switch (opcao) {
                case 1:
                    menuGerente();
                    break;
                case 2:
                    //chamar funcao funcionario
                    break;
                case 3:
                    //chamar funcao CLIENTE
                    break;
                case 0:
                    //finalizar programa
                    break;

                default:
                    System.err.println("Opção Inválida! ");
                    break;
            }
    }

    public void menuGerente(){
        System.out.println("Você selecionou gerente");

    }
}


