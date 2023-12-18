package biblioteca;

public class Livro {
  private String titulo;
  private String genero;
  private String autor;
  private boolean status;

  public Livro(String titulo, String genero, String autor, boolean status) {
    this.titulo = titulo;
    this.genero = genero;
    this.autor = autor;
    this.status = status;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public boolean isEmprestado() {
    return status;
  }

  public void emprestar() {
    this.status = true;
  }

  public void devolver() {
    this.status = false;
  }
}
