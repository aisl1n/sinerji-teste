public class Cargo {
    private String cargo;
    private double salario;

    private double valorVendido;
    public Cargo() {
    }

    public Cargo(String cargo, double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }
    public Cargo(String cargo, double salario, double valorVendido) {
        this.cargo = cargo;
        this.salario = salario;
        this.valorVendido = valorVendido;
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

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public double getBeneficioVendedor() {
        return valorVendido * 0.30;
    }

    public double getBeneficioSecretario() {
        return salario * 0.20;
    }
}
