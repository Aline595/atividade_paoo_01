package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import modelo.Empregado;
import modelo.EmpregadoDois;
import modelo.EmpregadoQuatro;
import modelo.EmpregadoTres;
import modelo.EmpregadoUm;

public class Teste {

    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();
        Random gerador = new Random();

        //Trecho 1 - Listagem 3
        for (int i = 0; i < 10; i++) {
            int tipo = 1 + gerador.nextInt(4);
            //empregados.add(new Empregado(tipo));
            if (tipo == 1) {
                empregados.add(new EmpregadoUm(tipo));
                double salario = 1500 + gerador.nextDouble() * 3500;
                empregados.get(i).setSalario(salario);
                //System.out.println(salario);
            } 
            else if (tipo == 2) {
                empregados.add(new EmpregadoDois(tipo));
                double salario = 1200 + gerador.nextDouble() * 1000;
                double percentualComissao = gerador.nextDouble();
                empregados.get(i).setSalario(salario);
                empregados.get(i).setPercentualComissao(percentualComissao);
                //System.out.println(percentualComissao + salario);
            } else if (tipo == 3) {
                empregados.add(new EmpregadoTres(tipo));
                double salario = 1100 + gerador.nextDouble() * 700;
                double percentualComissao = 0.2 + gerador.nextDouble() * 0.5;
                double bonus = 100;
                empregados.get(i).setSalario(salario);
                empregados.get(i).setPercentualComissao(percentualComissao);
                empregados.get(i).setBonus(bonus);
                //System.out.println(bonus + percentualComissao + salario);
            } else {
                empregados.add(new EmpregadoQuatro(tipo));
                double bonus = 2000 + gerador.nextDouble() * 2500;
                empregados.get(i).setBonus(bonus);
               // System.out.println(bonus);
            }
        }

        //Trecho 2 - Listagem 4
        for (Empregado e: empregados) {
            System.out.println("--------------------------\nTipo do empregado: " + e.getTipo());
            System.out.println(String.format("Salario a receber: %.2f", e.getSalario() + e.getBonus() + e.getPercentualComissao()));
        }
    }
}
