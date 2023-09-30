public class Usuario {

  String nome;
  int codigo;
  long cpf;
  long RG ;
  Endereco Endereco;

  public Usuario() {
    this.objEndereco = new Endereco();
  }

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
    return objEndereco;
  }

  public void setObjEndereco(Endereco objEndereco) {
    this.objEndereco = objEndereco;
  } 
}