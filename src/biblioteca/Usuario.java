public class Usuario {

  String nome;
  int codigo;
  long cpf;
  long RG ;
  Endereco endereco;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public long getCpf() {
    return cpf;
  }

  public void setCpf(long cpf) {
    this.cpf = cpf;
  }

  public Endereco getObjEndereco() {
    return endereco;
  }

  public void setObjEndereco(Endereco endereco) {
    this.endereco = endereco;
  } 
}