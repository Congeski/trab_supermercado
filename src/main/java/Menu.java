import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public int opcao = 0;

    public void menuInicial() {

            System.out.println("\n\n## Sistema de controle Supermercado ##");
            System.out.println();

            System.out.println("  ----------------------");
            System.out.println(" |     1 - GERENTE      |");
            System.out.println(" |     2 - VENDEDOR     |");
            System.out.println(" |     0 - SAIR         |");
            System.out.println("  ----------------------");

            System.out.print("Digite opção desejada: ");
            opcao = sc.nextInt();
            System.out.printf("Opção Escolhida: %d", opcao);
            System.out.println();

            switch (opcao) {
                case 1:
                    menuGerente();
                    break;
                case 2:
                    //chamar funcao funcionario
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


