
/**
 *
 * @author Aline
 */
package modelo;
public class EmpregadoDois extends Empregado {
    
    //atributos exclusivos
    private double percentualComissao;
   
    //construtor
    public EmpregadoDois(){
        
    }
    
    public EmpregadoDois(double percentualComissao){
        this.percentualComissao = percentualComissao;
    }
    
    // get e set exclusivos
    public double getPercentualComissao() {
        return percentualComissao;
    }
    
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    //sobrepor da classe pai salario final 
    public void salarioFinal(){
        double salarioFinal = getSalario() + getSalario() * getPercentualComissao();
        System.out.println("O salario final e: " + salarioFinal);
    }
    
    //aumenta salario
    public void aumentaSalario(double aumento, double percentual) {
        setSalario(1200 + aumento * 1000);
        setPercentualComissao(percentual);
    }
    
}