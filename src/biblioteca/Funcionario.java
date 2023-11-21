package biblioteca;

public class Funcionario {

  private String nome;
  private long cpf;
  private String cargo;
  private double salario;
  private String endereco;

  public Funcionario(String nome, long cpf, String cargo, double salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.cargo = cargo;
    this.salario = salario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public long getCpf() {
    return cpf;
  }

  public void setCpf(long cpf) {
    this.cpf = cpf;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getObjEndereco() {
    return endereco;
  }

  public void setObjEndereco(String objEndereco) {
    this.endereco = objEndereco;
  }

  // Método toString para representação de string do objeto
  @Override
  public String toString() {
    return "Funcionario{" +
        "nome='" + nome + '\'' +
        ", cpf=" + cpf +
        ", cargo='" + cargo + '\'' +
        ", salario=" + salario +
        ", objEndereco=" + endereco +
        '}';
  }
}
