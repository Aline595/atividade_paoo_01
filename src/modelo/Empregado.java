package modelo;

public class Empregado {
	protected int tipo;
	protected double salario;
	protected double percentualComissao;
	protected double bonus;
	
	public Empregado () {}
	
	public Empregado (int tipo) {
		this.setTipo(tipo);
	}
	
	public void aumentaSalario(double aumento) {
		setSalario(1500 + aumento * 3500); 
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
