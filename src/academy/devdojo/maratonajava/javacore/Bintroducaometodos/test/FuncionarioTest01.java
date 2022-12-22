package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Kilua";
        funcionario.idade = 14;
        funcionario.salario = new double[]{3050.50, 5320.70};

        funcionario.ImprimeFuncionario();
        funcionario.MediaSalarios();
    }
}
