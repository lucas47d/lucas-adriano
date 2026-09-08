public class ClasseFuncionarioPrincipal {
    String identificacao;
    String nomeFuncionario;
    String sobrenome;
    double salarioMensal;

    public double atualSalario() {
    return salarioMensal * 12;
    }
    public String nomeCompleto () {
        return nomeFuncionario + " " + sobrenome;
    }

    public double SalarioMensal() {
        return salarioMensal*12;
    }
    public void aumentarSalario(double percentualAumento) {
        double aumento = salarioMensal + percentualAumento/100;
        double salarioFinal = salarioMensal + aumento;
        salarioMensal = salarioFinal;
    }
}
