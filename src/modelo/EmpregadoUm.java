
package modelo;
public class EmpregadoUm extends Empregado{

    public EmpregadoUm() {

    }

    public void salarioFinal(){
        double salarioFinal = getSalario();
        System.out.println("O salario final e: " + salarioFinal);
    }
}
