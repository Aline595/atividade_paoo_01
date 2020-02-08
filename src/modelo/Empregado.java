
package modelo;
public class Empregado {

    private double salario;

    public Empregado() {

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void salarioFinal(){
        double salarioFinal = getSalario();
        System.out.println("O salario final e: " + salarioFinal);
    }
}
