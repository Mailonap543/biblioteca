package bibliotecaProject;

public class Usuario {

	  private String nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	  
	}

