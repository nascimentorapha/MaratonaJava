package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Kilua");
        funcionario.setIdade(14);
        funcionario.setSalario(new double[]{3050.50, 5320.70});

        funcionario.ImprimeFuncionario();
        funcionario.MediaSalarios();
    }
}
