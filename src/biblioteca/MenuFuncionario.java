import java.util.Scanner;

public class MenuFuncionario {

    private Scanner scanner = new Scanner(System.in);

    public void menuFuncionario() {
        int opcao = -1;

        while (opcao != 0) {
            exibirMenuFuncionario();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 0:
                    System.out.println("Saindo do menu de funcionário.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close(); 
    }

    public void exibirMenuFuncionario() {
        System.out.println("---- Menu do Funcionário ----");
        System.out.println("[1] Para cadastrar funcionário");
        System.out.println("[0] Para sair do menu de funcionário");
    }

    public void cadastrarFuncionario() {
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.next();

        System.out.println("Digite o CPF do funcionário:");
        long cpf = scanner.nextLong();

        System.out.println("Digite o cargo do funcionário:");
        String cargo = scanner.next();

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        System.out.println("Digite o endereço do funcionário:");
        System.out.println("Digite o bairro:");
        String bairro = scanner.next();
        System.out.println("Digite o número:");
        int numero = scanner.nextInt();
        System.out.println("Digite o nome da rua:");
        String rua = scanner.next();

        
        Endereco endereco = new Endereco(rua, bairro, numero);

        
    }
}
