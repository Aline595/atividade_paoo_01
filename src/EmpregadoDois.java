
/**
 *
 * @author Aline
 */

public class EmpregadoDois extends Empregado {

    /*public void aumentaSalario(double aumento, double percentual) {
        setSalario(1200 + aumento * 1000);
        setPercentualComissao(percentual);
    }*/
    
    public void salarioFinal(){
        double salarioFinal = getSalario() + getSalario() * getPercentualComissao();
    }
}