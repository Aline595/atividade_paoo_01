
/**
 *
 * @author Aline
 */
package modelo;
public class EmpregadoQuatro extends Empregado{
    public static int tipo = 4;
	
    public void salarioFinal(){
        double salarioFinal = getBonus();
        System.out.println("O salario final e: " + salarioFinal);
    }
}
