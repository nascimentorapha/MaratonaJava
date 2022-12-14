package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "A5";
        carro01.modelo = "Audi";
        carro01.ano = 2018;
        
        carro02.nome = "CLA200";
        carro02.modelo = "Mercedes Benz";
        carro02.ano = 2020;

        carro01 = carro02;

        System.out.println("Carro: " + carro01.nome + ", modelo: " + carro01.modelo + ", ano: " + carro01.ano);
        System.out.println("Carro: " + carro02.nome + ", modelo: " + carro02.modelo + ", ano: " + carro02.ano);
    }
}
