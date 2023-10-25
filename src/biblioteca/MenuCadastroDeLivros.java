import java.util.Scanner;

public class MenuCadastroDeLivros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Registrar Livros");
            System.out.println("2. Sair");
            System.out.print("Digite sua escolha: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    registrarLivros();
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, tente novamente.");
                    break;
            }
        } while (escolha != 2);
    }

    public static void registrarLivros() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registrar Livros");
        System.out.print("Digite o título: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o gênero: ");
        String genero = scanner.nextLine();
        System.out.print("Digite o autor: ");
        String autor = scanner.nextLine();

       System.out.println("Livro registrado com sucesso!");
    }
}
