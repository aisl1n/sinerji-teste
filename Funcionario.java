import java.util.List;

public class Funcionario {
  private String nome;
  private Cargo cargo;
  private int mesAdmissao;
  private int anoAdmissao;


  public Funcionario() {
  }

  public Funcionario(String nome, Cargo cargo, int mesAdmissao, int anoAdmissao) {
    this.nome = nome;
    this.cargo = cargo;
    this.mesAdmissao = mesAdmissao;
    this.anoAdmissao = anoAdmissao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Cargo getCargo() {
    return cargo;
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  public int getMesAdmissao() {
    return mesAdmissao;
  }

  public void setMesAdmissao(int mesAdmissao) {
    this.mesAdmissao = mesAdmissao;
  }

  public int getAnoAdmissao() {
    return anoAdmissao;
  }

  public void setAnoAdmissao(int anoAdmissao) {
    this.anoAdmissao = anoAdmissao;
  }
}
