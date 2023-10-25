import java.util.Scanner;


public class MenuLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de usuário:");
        String username = scanner.next();
        System.out.println("Digite a senha:");
        String inputPassword = scanner.next();
        
        scanner.close();
    }


}