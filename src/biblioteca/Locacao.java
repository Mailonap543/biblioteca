import java.util.Date;

public class Locacao {

    private double valorLocacao;
    private double valorMulta;
    private Usuario funcionario;
    private Usuario usuario;
    private Livro livro;
    private Date dataLocacao;
    private Date dataDevolucao;
    private Livro livroLocado;

    public Usuario getFuncionario() {
        return funcionario;
    }

    public void setUsuario(Usuario funcionario) {
        this.funcionario = funcionario;
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

}