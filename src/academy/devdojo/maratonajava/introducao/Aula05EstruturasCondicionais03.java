package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Aula de operador ternário
        // resultado (condicao) ? verdadeiro : falso
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro Rapha";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
