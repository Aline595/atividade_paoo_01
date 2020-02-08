
/**
 *
 * @author Aline
 */

public class EmpregadoTres extends Empregado {
    
    //atributos exclusivos
    private double percentualComissao;
    private double bonus;
   
    //construtor
    public EmpregadoTres(){
        
    }
    
    public EmpregadoTres(double percentualComissao, double bonus){
        this.percentualComissao = percentualComissao;
        this.bonus = bonus;
    }
    
    // get e set exclusivos
    public double getPercentualComissao() {
        return percentualComissao;
    }
    
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public double getBonus(){
        return bonus;
    }
    
    public void setBonus( double bonus){
        this.bonus = bonus;
    }
    
    //sobrepor da classe pai salario final 
    @Override
    public void salarioFinal(){
        double salarioFinal = getSalario() + getSalario() + getPercentualComissao() + getBonus();
        System.out.println("O salario final e: " + salarioFinal);
        
    }
    
    //aumenta salario
    public void aumentaSalario(double aumento, double percentual) {
        double bonus = 100;
        setSalario(1100 + aumento * 700);
        setPercentualComissao(0.2 + percentual * 0.5);
        setBonus(bonus);
    }
    
}