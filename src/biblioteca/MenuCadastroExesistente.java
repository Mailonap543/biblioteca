
import java.util.Scanner;

public class MenuCadastroExistente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o userName: ");
        String userName = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        System.out.print("Digite a permissão (funcionario/dono/cliente): ");
        String permissao = scanner.nextLine();
      
       scanner.close();
    }
}
