import java.util.Scanner;

import biblioteca.Usuario;

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
          cadastrarFuncionario(scanner);
          break;
        case 2:
          cadastrarUsuario(scanner);
          break;
        case 3:
          cadastrarLivro(scanner);
          break;
        case 4:
          mostrarDadosDeCadastro(scanner);
          break;
        case 5:
          irParaLocao(scanner);
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

  public static void cadastrarFuncionario(Scanner scanner) {
    System.out.println("Digite seu nome");
    // DEVE CADASTRAR TODOS OS DADOS QUE EXISTEM NA CLASSE FUNCIONÁRIO
    String nome = scanner.next();
    System.out.println(nome);
  }

  public static void cadastrarUsuario(Scanner scanner) {
    System.out.println("Digite seu nome");
    // DEVE CADASTRAR TODOS OS DADOS QUE EXISTEM NA CLASSE USUARIO
    String nome = scanner.next();
    System.out.println(nome);
  }

  public static void cadastrarLivro(Scanner scanner) {
    System.out.println("Digite o  nome do livro");
    // CADASTRAR OS DADOS CORRETOS
    String nome = scanner.next();
    System.out.println(nome);
  }

  public static void mostrarDadosDeCadastro() {
    System.out.println("os dados cadastrados sao: ");
  }

  public static void irParaLocao() {
    System.out.println("Digite seu nome");
  }
}