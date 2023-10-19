import java.util.Scanner;
public class Menulogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de usuário:");
        String username = scanner.next();
        System.out.println("Digite a senha:");
        String password = scanner.next();

        if (password.equals("senhaSalva")) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Senha incorreta. Tente novamente.");
        }
        scanner.close();
    }
}
