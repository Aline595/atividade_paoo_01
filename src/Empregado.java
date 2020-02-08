
public class Empregado {

    private int tipo;
    private double salario;
    private double percentualComissao;
    private double bonus;

    public Empregado() {

    }

    public Empregado(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public void salarioFinal(int tipo){
        double salarioFinal = 0;
            if (tipo == 1) {
                salarioFinal = getSalario();
            } else if (tipo == 2) {
                salarioFinal = getSalario() + getSalario() * getPercentualComissao();
            } else if (tipo == 3) {
                salarioFinal = getSalario() + getSalario() + getPercentualComissao() + getBonus();
            } else if (tipo == 4) {
                salarioFinal = getBonus();
            }
            System.out.println(String.format("%.2f", salarioFinal));
    }
}
