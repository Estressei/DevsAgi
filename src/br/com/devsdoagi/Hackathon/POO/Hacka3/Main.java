package br.com.devsdoagi.Hackathon.POO.Hacka3;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("Pietra", 2500);
        Analista a = new Analista("Joao", 2000);

        System.out.println("Gerente: " +g.getNome());
        System.out.println("Salario: " + g.getSalario());
        System.out.println("Bonus: " + g.bonusFixo());

        System.out.println("\nAnalista: " +a.getNome());
        System.out.println("Salario: " + a.getSalario());
        System.out.println("Bonus: " + a.bonusFixo());
    }
}
