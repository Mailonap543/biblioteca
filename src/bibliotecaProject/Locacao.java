package bibliotecaProject;

import java.util.Date;

public class Locacao {

	  private double valorLocacao;
	  private double valorMulta;
	  private Funcionario funcionario;
	  private Usuario usuario;
	  private Livro livro;
	  private Date dataLocacao;
	  private Date dataDevolucao;
	  private Livro livroLocado;

	  public Funcionario getFuncionario() {
	    return funcionario;
	  }

	  public void setFuncionario(Funcionario funcionario) {
	    this.funcionario = funcionario;
	  }

	  public Usuario getUsuario() {
	    return usuario;
	  }

	  public void setUsuario(Usuario usuario) {
	    this.usuario = usuario;
	  }

	  public Livro getLivro() {
	    return livro;
	  }

	  public void setLivro(Livro livro) {
	    this.livro = livro;
	  }

	  public Date getDataLocacao() {
	    return dataLocacao;
	  }

	  public void setDataLocacao(Date dataLocacao) {
	    this.dataLocacao = dataLocacao;
	  }

	  public Livro getLivroLocado() {
	    return livroLocado;
	  }

	  public void setLivroLocado(Livro livroLocado) {
	    this.livroLocado = livroLocado;
	  }

	  public double getValorLocacao() {
	    return valorLocacao;
	  }

	  public void setValorLocacao(double valorLocacao) {
	    this.valorLocacao = valorLocacao;
	  }

	  public double getValorMulta() {
	    return valorMulta;
	  }

	  public void setValorMulta(double valorMulta) {
	    this.valorMulta = valorMulta;
	  }

	  public Date getDataDevolucao() {
	    return dataDevolucao;
	  }

	}
