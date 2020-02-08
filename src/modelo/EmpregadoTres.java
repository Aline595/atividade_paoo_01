
/**
 *
 * @author Aline
 */
package modelo;

public class EmpregadoTres extends Empregado{
	public static int tipo = 3;
	
    //construtor
    public EmpregadoTres(){
        
    }
    
    public void salarioFinal(){
        double salarioFinal = getSalario() + getSalario() + getPercentualComissao() + getBonus();
        System.out.println("O salario final e: " + salarioFinal);
        
    }
   
}
