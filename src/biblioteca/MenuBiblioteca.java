import java.util.Date;
import java.util.Scanner;

public class MenuBiblioteca {

    Scanner scanner = new Scanner(System.in);
    MenuFuncionario menuFuncionario = new MenuFuncionario();

    public void menuBiblioteca() {
        int opcao;

        do {
            exibirMenu();

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    menuFuncionario.cadastrarFuncionario();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    cadastrarLivro();
                    break;
                case 4:
                    mostrarDadosCadastro();
                    break;
                case 5:
                    irParaLocacao();
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void exibirMenu() {
        System.out.println("[1] - Cadastrar funcionário");
        System.out.println("[2] - Cadastrar usuário");
        System.out.println("[3] - Cadastrar livro");
        System.out.println("[4] - Mostrar dados do cadastro");
        System.out.println("[5] - Ir para locação");
        System.out.println("[0] - Sair");
        System.out.print("Digite aqui a opção: ");
    }

    public void cadastrarUsuario() {
        System.out.println("Opção 2 - Cadastrar usuário selecionada.");
    }

    public void cadastrarLivro() {
        System.out.println("Opção 3 - Cadastrar livro selecionada.");
    }

    public void mostrarDadosCadastro() {
        System.out.println("Opção 4 - Mostrar dados do cadastro selecionada.");
    }

    public void irParaLocacao() {
        System.out.println("Opção 5 - Ir para locação selecionada.");
    }

}