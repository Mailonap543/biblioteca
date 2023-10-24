import java.util.Scanner;

public class MenuCadastros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Selecione o cadastro que deseja acessar:\n"
            + "1 - Cadastro do Funcionário\n"
            + "2 - Cadastro do Cliente\n"
            + "3 - Cadastro do Livro\n"
            + "9 - Voltar ao menu principal\n"
            + "Digite a opção desejada: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Cadastro de Funcionário selecionado.");
            
                break;
            case 2:
                System.out.println("Cadastro de Cliente selecionado.");
                
                break;
            case 3:
                System.out.println("Cadastro de Livro selecionado.");
                
                break;
            case 9:
                System.out.println("Voltar ao menu principal.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
