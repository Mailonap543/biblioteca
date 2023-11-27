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
          cadastrarFuncionario();
          break;
        case 2:
            cadastrarUsuario();
          break;
        case 3:
            cadastrarLivro();
          break;
        case 4:
            mostrarDadosDeCadastro();
          break;
        case 5:
            irParaLocao();
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

  public static void cadastrarFuncionario() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu nome");
    String nome = scanner.next();
    System.out.println(nome);
  }

  public static void cadastrarUsuario() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu nome");
    String nome = scanner.next();
    System.out.println(nome);
  }
  public static void cadastrarLivro() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o  nome do livro");
    String nome = scanner.next();
    System.out.println(nome);
  }
  public static void mostrarDadosDeCadastro() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("os dados cadastrados sao: ");
    String nome = scanner.next();
    System.out.println(nome);

  }
  public static void irParaLocao() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu nome");
    String nome = scanner.next();
    System.out.println(nome);
  }
}