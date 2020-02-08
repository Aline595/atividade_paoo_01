
/**
 *
 * @author Aline
 */
package modelo;
public class EmpregadoQuatro extends Empregado{
    
    //atributos exclusivos
    private double bonus;
    
    //construtor
    public EmpregadoQuatro(){
    
    }
    
    public EmpregadoQuatro(double bonus){
        this.bonus = bonus;
    }
    
    //get e set exclusivo
    public double getBonus(){
        return bonus;
    }
    
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    @Override
    public void salarioFinal(){
        double salarioFinal = getBonus();
        System.out.println("O salario final e: " + salarioFinal);
    }
    
    public void aumentaSalario(double bonus){
        setBonus(2000 + bonus * 2500);
    }
    
}
