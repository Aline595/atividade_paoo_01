
/**
 *
 * @author Aline
 */
package modelo;
public class EmpregadoDois extends Empregado {
	
	public static int tipo = 2;
		
	public void salarioFinal() {
		double salarioFinal = 0;
		salarioFinal = getSalario();
		System.out.println(String.format("%.2f", salarioFinal));
	}

}
