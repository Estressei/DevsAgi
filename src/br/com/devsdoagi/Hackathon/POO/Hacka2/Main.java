package br.com.devsdoagi.Hackathon.POO.Hacka2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Pietra", "pietra123@gmail.com");
        ProdutoFisico pf = new ProdutoFisico(1234, "Computador", 100, "Fernanda");
        ProdutoDigital pd = new ProdutoDigital(54321, "HD", 200, "Ste");

        pf.aplicarDesconto(10);
        pf.aumentarPreco(5);
        System.out.println("Preço final do produto fisico: " + pf.getPreco());
        System.out.println("Frete: " + pf.calcularFrete());


        pd.aplicarDesconto(20);
       pd.aumentarPreco(15);
        System.out.println("Preço final do produto digital: " + pd.getPreco());
        System.out.println("Frete: " + pd.calcularFrete());
    }
}
