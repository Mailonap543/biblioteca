import java.util.Scanner;

public class MenuCadastros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Selecione o cadastro na qual o mesmo queira acessar:\n"
            + "1 - Cadastro do Funcionário\n"
            + "2 - Cadastro do Cliente\n"
            + "3 - Cadastro do livro\n"
            + "9 - Voltar ao menu principal\n"
            + "Digite a opção desejada: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
          
          case 1:
            System.out.print("cadastrando fucionario");
              
                break;
            case 2:
             System.out.print("cadastro de cliente");
                
                break;
            case 3:
                System.out.print("cadastrar livro");
                break;
            case 9:
                 System.out.print("digite 9 para sair");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();
    }
}