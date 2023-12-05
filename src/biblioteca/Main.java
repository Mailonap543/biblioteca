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

  public static void cadastrarFuncionario(Scanner scanner) {
    System.out.println("Digite seu nome");
    String nome = scanner.next();
    System.out.println(nome);

    System.out.println("Digite seu cpf");
    long cpf = scanner.nextLong();
    System.out.println(cpf);

    System.out.println("Digite seu salario");
    double salario = scanner.nextDouble();
    System.out.println(salario);

    System.out.println("Digite seu cargo");
    String cargo = scanner.next();
    System.out.println(cargo);

    System.out.println("Digite seu endereco");
    String endereco = scanner.next();
    System.out.println(endereco);
  }

  public static void cadastrarUsuario(Scanner scanner) {
    System.out.println("Digite seu nome");
    String nome = scanner.next();
    System.out.println(nome);

    System.out.println("Digite seu userName");
    String userName = scanner.next();
    System.out.println(userName);

    System.out.println("Digite sua senha");
    String senha = scanner.next();
    System.out.println(senha);

    System.out.println("Digite sua permissão");
    String permissao = scanner.next();
    System.out.println(permissao);

    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();
    System.out.println(idade);

  }

  public static void cadastrarLivro(Scanner scanner) {
    System.out.println("Digite o  nome do livro");
    String titulo = scanner.next();
    System.out.println(titulo);

    System.out.println("Digite o  genero do livro");
    String genero = scanner.next();
    System.out.println(genero);

    System.out.println("Digite o  autor do livro");
    String autor = scanner.next();
    System.out.println(autor);

  }

  public static void mostrarDadosDeCadastro(Scanner scanner) {
  }

  public static void irParaLocao() {
    int opcao;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("\n::::::::::::::::: Sistema de Locação ::::::::::::::::::\n" +
          " Escolha uma opção abaixo\n" +
          " [1] - Locar livro\n" +
          " [2] - Devolver livro\n" +
          " [3] - Mostrar os dados do livro locado\n" +
          " [4] - Mostra os dados do livro devolvido\n" +
          " [5] - Sair da locação\n" +
          " Digite aqui a opção: \n");

      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          locarLivro(scanner);
          break;
        case 2:
          devolverLivro(scanner);
          break;
        case 3:
          mostrarDadosDoLivroLocado();
          break;
        case 4:
          mostrarDadosDoLivroDevolvido();
          break;
        case 5:
          System.out.println("Saindo do programa.");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
          break;
      }
    } while (opcao != 5);

  }

  public static void locarLivro(Scanner scanner) {
    // Implementar lógica passando os dados do livro que você quer locar.
    System.out.println("Digite o titulo do livro que você deseja locar:");
    String nome = scanner.next();
    System.out.println(nome);
  }

  public static void devolverLivro(Scanner scanner) {
    // Implementar lógica passando os dados do livro que você quer devolver.
  }

  public static void mostrarDadosDoLivroLocado() {
    // Implementar lógica passando os dados do livro locado que você quer mostrar os
    // dados.
  }

  public static void mostrarDadosDoLivroDevolvido() {
    // Implementar lógica passando os dados do livro devolvido que você quer mostrar
    // os dados.
  }
}