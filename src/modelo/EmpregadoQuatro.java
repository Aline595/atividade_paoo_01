
package modelo;

public class EmpregadoQuatro extends Empregado{
    
    public EmpregadoQuatro(int tipo) {
        this.tipo = tipo;
        this.salario = this.bonus;
    }
}
