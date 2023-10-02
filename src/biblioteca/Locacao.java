public class Locacao {
private double valorLocacao;
private double valorMulta;
private Funcionario funcionario;
private Usuario usuario;
private Livro livro;
private Data dataLocacao;
private Data dataDevolucao;
private Livro livroLocado;

public Funcionario getFuncionario() {
  return funcionario;
}

public void setFucionario(Funcionario funcionario) {
  this.funcionario = funcionario;
}

public Livro getLivro() {
  return livro;
}

public void setLivro(Livro livro ) {
  this.livro =  livro;
}

public date getDataLocacao() {
  return dataLocacao;
}

public void setDataLocacao(date dataLocacao) {
  this.dataLocacao = dataLocacao;
}
public Livro getLivroLocado(){
  return livroLocado;
    
}
public void setLivroLocado(Livro livroLocado) {
  this.livroLocado = livroLocado;
  }
}
