package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // (operador de resto) = %
        int resto = 21 % 2;
        System.out.println(resto);

        // < | > | <= | >= | == | != sempre retorna valores booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // && (AND), || (OR), ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean IsDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean IsDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("IsDentroDaLeiMaiorQueTrinta " + IsDentroDaLeiMaiorQueTrinta);
        System.out.println("IsDentroDaLeiMenorQueTrinta " + IsDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus *= 2.5;
        bonus /= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador++;
        System.out.println(contador);
    }
}
