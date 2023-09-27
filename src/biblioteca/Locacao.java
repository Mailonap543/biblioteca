public class Locacao {
private double valorLocacao;
private double valorMulta;
private Funcionario Funcionario;
private Usuario Usuario;
private Livro Livro;
private Data dataLocacao;
private Data dataDevolucao;
private Livro LivroLocado;

public Locacao() {
  this.Funcionario = new Funcionario();
  this.Usuario = new Usuario();
  this.Livro = new Livro();
  this.dataLocacao = new Data();
  this.dataDevolucao = new Data();
  this.LivroLocado = new Livro();
}
public String getFuncionario() {
  return funcionario;
}

public void setFucionario(String funcionario) {
  this.funcionario = funcionario;
}

public String getLivro() {
  return livro;
}

public void setLivro(String livro ) {
  this. livro =  livro;
}

public date getDataLocacao() {
  return DataLocacao;
}

public void setDataLocacao(date dataLocacao) {
  this.dataLocacao = dataLocacao;
}

public date DataDevolucao() {
  return dataDevolucao;
}

public void DataDevolucao(boolean status) {
  this.status = status;
    
}
public string getLivroALocado(){
  return livroAlocado;
    
}
public void setLivroALocado(string LivroALocado) {
  this.LivroALocado = LivroALocado;
  }
}
