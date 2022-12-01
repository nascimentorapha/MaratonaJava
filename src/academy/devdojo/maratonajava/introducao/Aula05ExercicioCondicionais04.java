package academy.devdojo.maratonajava.introducao;

public class Aula05ExercicioCondicionais04 {
    public static void main(String[] args) {
        double salario = 45000, limiteSalario1 = 34712, limiteSalario2 = 68507;
        double taxa1 = 0.097, taxa2 = 0.3735, taxa3 = 0.495;
        double imposto;

        if (salario <= limiteSalario1) {
            imposto = salario * taxa1;
            System.out.println("O seu imposto devido é de " + imposto + ", pois seu salário é de " + salario + " com uma taxa de " + taxa1);
        } else if (salario > limiteSalario1 && salario <= limiteSalario2) {
            imposto = salario * taxa2;
            System.out.println("O seu imposto devido é de " + imposto + ", pois seu salário é de " + salario + " com uma taxa de " + taxa2);
        } else {
            imposto = salario * taxa3;
            System.out.println("O seu imposto devido é de " + imposto + ", pois seu salário é de " + salario + " com uma taxa de " + taxa3);
        }
    }
}
