import java.util.ArrayList;
import java.util.List;

public class TesteEmpresa {
  public static void main(String[] args) {
    Funcionario func1 = new Funcionario("Jorge Carvalho", new Cargo("Secretário", 7000.0), 1, 2018);
    Funcionario func2 = new Funcionario("Maria Souza", new Cargo("Secretário", 7000.0), 12, 2015);
    Funcionario func3 = new Funcionario("Ana Silva", new Cargo("Vendedor", 12000.0, 5200), 12, 2021);
    Funcionario func4 = new Funcionario("João Mendes", new Cargo("Vendedor", 12000.0, 3400), 12, 2021);
    Funcionario func5 = new Funcionario("Juliana Alves", new Cargo("Gerente", 20000.0), 7, 2017);
    Funcionario func6 = new Funcionario("Bento Albino", new Cargo("Gerente", 20001.0), 3, 2014);


    List<Funcionario> funcionarios = new ArrayList<>();
    funcionarios.add(func1);
    funcionarios.add(func2);
    funcionarios.add(func3);
    funcionarios.add(func4);
    funcionarios.add(func5);
    funcionarios.add(func6);

    Empresa empresa = new Empresa();

    double totalPago = empresa.calcularTotalPago(funcionarios, 12, 2021);
    double totalPagoSemBeneficios = empresa.calcularTotalPagoSemBeneficios(funcionarios, 6, 2022);
    double totalPagoEmBeneficios = empresa.calcularTotalPagoEmBeneficios(funcionarios, 6, 2022);
    String salarioMaisAlto = empresa.calcularSalarioMaisAlto(funcionarios, 6, 2022);
    String beneficioMaisAlto = empresa.calcularValorMaisAltoEmBeneficios(funcionarios, 6, 2022);
    String vendedorQueMaisVendeu = empresa.calcularVendedorQueMaisVendeu(funcionarios, 6, 2022);

    System.out.println("1 - Total pago no mês: R$"+totalPago);
    System.out.println("2 - Total pago sem benefícios extras: R$"+totalPagoSemBeneficios);
    System.out.println("3 - Total pago somente em benefícios extras: R$"+totalPagoEmBeneficios);
    System.out.println("4 - O salário mais alto pago nesse mês foi de "+salarioMaisAlto);
    System.out.println("5 - O valor mais alto em benefícios foi de "+beneficioMaisAlto);
    System.out.println("6 - O vendedor(a) que mais vendeu foi o(a) "+vendedorQueMaisVendeu);
  }
}
