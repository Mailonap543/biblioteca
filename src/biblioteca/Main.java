import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {
                System.out.println("[1] - Cadastrar funcionário");
                System.out.println("[2] - Cadastrar usuário");
                System.out.println("[3] - Cadastrar livro");
                System.out.println("[4] - Mostrar dados do cadastro");
                System.out.println("[5] - Ir para locação");
                System.out.println("[0] - Sair");
                System.out.print("Digite aqui a opção: ");

                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Opção 1 - Cadastrar funcionário selecionada.");
                        break;
                    case 2:
                        System.out.println("Opção 2 - Cadastrar usuário selecionada.");
                        break;
                    case 3:
                        System.out.println("Opção 3 - Cadastrar livro selecionada.");
                        break;
                    case 4:
                        System.out.println("Opção 4 - Mostrar dados do cadastro selecionada.");
                        break;
                    case 5:
                        System.out.println("Opção 5 - Ir para locação selecionada.");
                        break;
                    case 0:
                        System.out.println("Saindo do programa.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } while (opcao != 0);
        }
    }