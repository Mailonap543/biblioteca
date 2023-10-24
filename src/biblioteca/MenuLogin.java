import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt; 

public class Menulogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de usuário:");
        String username = scanner.next();
        System.out.println("Digite a senha:");
        String inputPassword = scanner.next();

      
        String hashedPassword = BCrypt.hashpw(inputPassword, BCrypt.gensalt());
        String storedPassword = obterSenhaDoBancoDeDados(username); 

        if (BCrypt.checkpw(inputPassword, storedPassword)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Senha incorreta. Tente novamente.");
        }
        scanner.close();
    }


}