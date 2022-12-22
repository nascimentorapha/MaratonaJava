package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double mediaSalario;

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
        if (salario == null) {
            return;
        }
        for (double salarios : this.salario) {
            mediaSalario += salarios;
        }
        mediaSalario = mediaSalario / this.salario.length;
        System.out.println("\nMedia salarial do funcionário " + this.nome + " = " + mediaSalario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMediaSalario() {
        return mediaSalario;
    }
}
