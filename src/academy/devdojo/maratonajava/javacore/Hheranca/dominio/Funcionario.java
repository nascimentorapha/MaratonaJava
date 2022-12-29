package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{

    private double salario;

    public void imprime(){
        super.imprime(); //executa primeiro o método da classe pai, então este a seguir
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }



    public void setSalario(double salario) {
        this.salario = salario;
    }
}
