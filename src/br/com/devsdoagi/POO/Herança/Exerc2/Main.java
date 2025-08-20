package br.com.devsdoagi.POO.Herança.Exerc2;

public class Main {
    public static void main(String[] args) {
        ProdutoPerecivel prod = new ProdutoPerecivel("55", "Chocolate", 5.50, "2025-08-22");
        System.out.println("Validade do produto: "+ prod.getDataValidade());

        System.out.println("Esta vencido? " +prod.estaVencido("2025-07-11"));

    }
}
