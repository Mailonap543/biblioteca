import java.util.Scanner;

public class MenuLocacaoLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("::::::::::::::::: Sistema de Locação ::::::::::::::::::");
            System.out.println("Escolha uma opção abaixo");
            System.out.println("[1] - Locar livro");
            System.out.println("[2] - Devolver livro");
            System.out.println("[3] - Mostrar os dados do livro locado");
            System.out.println("[4] - Mostra os dados do livro devolvido");
            System.out.println("[5] - Sair da locação");
            System.out.print("Digite aqui a opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    locarLivro();
                    break;
                case 2:
                    devolverLivro();
                    break;
                case 3:
                    mostrarDadosLivroLocado();
                    break;
                case 4:
                    mostrarDadosLivroDevolvido();
                    break;
                case 5:
                    System.out.println("Saindo da locação...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);
    }

    public static void locarLivro() {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
      
        System.out.println("Digite o nome do locatário:");
        String locatario = scanner.nextLine();
      
        System.out.println("Digite a data de locação:");
        String dataLocacao = scanner.nextLine();

        System.out.println("Digite a data de devolução:");
        String dataDevolucao = scanner.nextLine();
    }

    public static void devolverLivro() {
      
      if (livroEmprestado) {
          livroEmprestado = false;
          System.out.println("Livro devolvido com sucesso.");
      } else {
          System.out.println("O livro já está disponível na biblioteca.");
      }
    
 }
 
}
