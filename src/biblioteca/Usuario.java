package biblioteca;
import java.util.ArrayList;
public class Usuario {

    public String nome;
    public int idade;
    public String userName;
    public String senha;
    public String permissao;


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