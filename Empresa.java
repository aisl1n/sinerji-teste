import java.util.List;

public class Empresa {

  public double calcularTotalPago(List<Funcionario> funcionarios, int mes, int ano) {
    double totalPago = 0.0;

    for (Funcionario funcionario : funcionarios) {
      if ((funcionario.getMesAdmissao() <= mes && funcionario.getAnoAdmissao() <= ano) || (funcionario.getMesAdmissao() >= mes && funcionario.getAnoAdmissao() < ano)) {
        if (funcionario.getCargo().getCargo().equals("Vendedor")) {
          totalPago += funcionario.getCargo().getSalario() + funcionario.getCargo().getBeneficioVendedor();
        }
        else if (funcionario.getCargo().getCargo().equals("Secretário")) {
          totalPago += funcionario.getCargo().getSalario() + funcionario.getCargo().getBeneficioSecretario();
        }
        else if (funcionario.getCargo().getCargo().equals("Gerente")) {
          totalPago += funcionario.getCargo().getSalario();
        }
      }
    }

    return totalPago;
  }
  public double calcularTotalPagoSemBeneficios(List<Funcionario> funcionarios, int mes, int ano) {
    double totalPago = 0.0;

    for (Funcionario funcionario : funcionarios) {
      if ((funcionario.getMesAdmissao() <= mes && funcionario.getAnoAdmissao() <= ano) || (funcionario.getMesAdmissao() >= mes && funcionario.getAnoAdmissao() < ano)) {
        if (funcionario.getCargo().getCargo().equals("Vendedor")) {
          totalPago += funcionario.getCargo().getSalario();
        }
        else if (funcionario.getCargo().getCargo().equals("Secretário")) {
          totalPago += funcionario.getCargo().getSalario();
        }
        else if (funcionario.getCargo().getCargo().equals("Gerente")) {
          totalPago += funcionario.getCargo().getSalario();
        }
      }
    }
    return totalPago;
  }

  public double calcularTotalPagoEmBeneficios(List<Funcionario> funcionarios, int mes, int ano) {
    double totalEmBeneficios = 0.0;

    for (Funcionario funcionario : funcionarios) {
      if ((funcionario.getMesAdmissao() <= mes && funcionario.getAnoAdmissao() <= ano) || (funcionario.getMesAdmissao() >= mes && funcionario.getAnoAdmissao() < ano)) {
        if (funcionario.getCargo().getCargo().equals("Vendedor")) {
          totalEmBeneficios += funcionario.getCargo().getBeneficioVendedor();
        }
        else if (funcionario.getCargo().getCargo().equals("Secretário")) {
          totalEmBeneficios += funcionario.getCargo().getBeneficioSecretario();
        }
      }
    }
    return totalEmBeneficios;
  }

  public String calcularSalarioMaisAlto(List<Funcionario> funcionarios, int mes, int ano) {
    double salarioMaisAlto = 0.0;
    String nomeFuncionario = "";
    String salarioMaisAltoFinal = "";

    for (Funcionario funcionario : funcionarios) {
      if ((funcionario.getMesAdmissao() <= mes && funcionario.getAnoAdmissao() <= ano) || (funcionario.getMesAdmissao() >= mes && funcionario.getAnoAdmissao() < ano)) {
        if (funcionario.getCargo().getCargo().equals("Vendedor")) {
          double total = funcionario.getCargo().getSalario() + funcionario.getCargo().getBeneficioVendedor();
          if(salarioMaisAlto < total) {
            nomeFuncionario = funcionario.getNome();
            salarioMaisAlto = total;
          }
        }
        else if (funcionario.getCargo().getCargo().equals("Secretário")) {
          double total = funcionario.getCargo().getSalario() + funcionario.getCargo().getBeneficioSecretario();
          if(salarioMaisAlto < total) {
            nomeFuncionario = funcionario.getNome();
            salarioMaisAlto = total;
          }
        }
        else if (funcionario.getCargo().getCargo().equals("Gerente")) {
          double total = funcionario.getCargo().getSalario();
          if(salarioMaisAlto < total) {
            nomeFuncionario = funcionario.getNome();
            salarioMaisAlto = total;
          }
        }
      }
    }
    return salarioMaisAltoFinal = nomeFuncionario + " com um total de R$"+String.valueOf(salarioMaisAlto);
  }

  public String calcularValorMaisAltoEmBeneficios(List<Funcionario> funcionarios, int mes, int ano) {
    double beneficioMaisAlto = 0.0;
    String nomeFuncionario = "";
    String maiorBeneficio = "";

    for (Funcionario funcionario : funcionarios) {
      if ((funcionario.getMesAdmissao() <= mes && funcionario.getAnoAdmissao() <= ano) || (funcionario.getMesAdmissao() >= mes && funcionario.getAnoAdmissao() < ano)) {
        if (funcionario.getCargo().getCargo().equals("Vendedor")) {
          double total = funcionario.getCargo().getBeneficioVendedor();
          if(beneficioMaisAlto < total) {
            nomeFuncionario = funcionario.getNome();
            beneficioMaisAlto = total;
          }
        }
        else if (funcionario.getCargo().getCargo().equals("Secretário")) {
          double total = funcionario.getCargo().getBeneficioSecretario();
          if(beneficioMaisAlto < total) {
            nomeFuncionario = funcionario.getNome();
            beneficioMaisAlto = total;
          }
        }
      }
    }
    return maiorBeneficio = nomeFuncionario + " com um total de R$"+String.valueOf(beneficioMaisAlto);
  }

  public String calcularVendedorQueMaisVendeu(List<Funcionario> funcionarios, int mes, int ano) {
    double totalVendido = 0.0;
    String nomeFuncionario = "";
    String maiorVendedor = "";

    for (Funcionario funcionario : funcionarios) {
      if ((funcionario.getMesAdmissao() <= mes && funcionario.getAnoAdmissao() <= ano) || (funcionario.getMesAdmissao() >= mes && funcionario.getAnoAdmissao() < ano)) {
        if (funcionario.getCargo().getCargo().equals("Vendedor")) {
          double total = funcionario.getCargo().getValorVendido();
          if(totalVendido < total) {
            nomeFuncionario = funcionario.getNome();
            totalVendido = total;
          }
        }
      }
    }
    return maiorVendedor = nomeFuncionario + " com um total de R$"+String.valueOf(totalVendido);
  }
}