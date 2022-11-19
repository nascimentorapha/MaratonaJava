package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // tipos primitivos = int, double, float, char, byte, short, long, boolean
        int age = 27;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";

        System.out.println("A idade é "+age+" anos");
        System.out.println(verdadeiro);
        System.out.println("char "+caractere);
        System.out.println("Oi meu nome é "+nome);
    }
}
