package academy.devdojo.maratonajava.introducao;

public class Aula05ExercicioCondicionais06 {
    public static void main(String[] args) {
        int dia = 6;
        switch (dia){
            case 1, 7:
                System.out.println("Fim de semana, uhul!");
                break;
            case 2, 3, 4 ,5, 6:
                System.out.println("Dia de semana...");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
