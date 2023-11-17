package biblioteca;
import java.util.ArrayList;
public class Usuario {

    privateString nome;
    private int idade;
    private String userName;
    private String senha;
    private String permissao;


    public Usuario(String nome, int idade, String userName, String senha, String permissao) {
        this.nome = nome;
        this.idade = idade;
        this.userName = userName;
        this.senha = senha;
        this.permissao = permissao;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

}