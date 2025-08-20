package br.com.devsdoagi.POO.Exemplo;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    //metodos
    public void acelerar(){
        System.out.println("O carro esta acelerando.");
    }

    public void frear(){
        System.out.println("O carro esta freando.");
    }

    public void mostrarInformacoes(){
        System.out.println("Marca: " +this.marca);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ano: " +this.ano);
    }
}
