package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void ImprimeFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null) {
            return;
        }
        for (double salarios : this.salario) {
            System.out.print(salarios + " ");
        }
    }

    public void MediaSalarios() {
        double mediaSalario = 0;
        if (salario == null) {
            return;
        }
        for (double salarios : this.salario) {
            mediaSalario += salarios;
        }
        mediaSalario = mediaSalario / this.salario.length;
        System.out.println("\nMedia salarial do funcionário " + this.nome + " = " + mediaSalario);
    }
}
