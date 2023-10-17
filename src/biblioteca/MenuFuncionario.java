import java.util.Scanner;

public class MenuFuncionario {

  Scanner scanner = new Scanner(System.in);

  public void menuFuncionario() {
    int opcao = 0;

    while (opcao != 0) {
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          cadastrarFuncionario();
          break;
        case 0:
          break;

        default:
          break;
      }
    }
  }

  public void exibirMenuFuncionario() {
    System.out.println("[1] Para inserir os dados do funcionário ");
    System.out.println("[0] - Sair");
  }

  public void cadastrarFuncionario() {
    System.out.println("Digite seu nome");
    String nome = scanner.next();
    System.out.println("Digite seu CPF");
    long cpf = scanner.nextLong();
    System.out.println("Digite seu cargo");
    String cargo = scanner.next();
    System.out.println("Digite seu salario");
    double salario = scanner.nextDouble();
    System.out.println("Digite seu ENDERECO");
    Endereco endereco = scanner.next();
    System.out.println("Digite seu bairro");
String bairro = scanner.next();

System.out.println("Digite seu numero");
int numero = scanner.nextInt();
    
Endereco  = new Endereco(rua, bairro, numero);


  }
}
