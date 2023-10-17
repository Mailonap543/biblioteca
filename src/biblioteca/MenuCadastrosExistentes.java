import java.util.Scanner;

public class MenuCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Selecione o cadastro na qual o mesmo queira acessar:\n"
            + "1 - Cadastro do Funcionário\n"
            + "2 - Cadastro do Usuário\n"
            + "3 - Cadastro do livro\n"
            + "9 - Voltar ao menu principal\n"
            + "Digite a opção desejada: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 
            
                break;
            case 2:
                
                break;
            case 3:
               
                break;
            case 9:
                
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();
    }
}