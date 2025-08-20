package br.com.devsdoagi.POO.Exemplo;

public class Main {
    public static void main(String[] args) {
         Carro carro = new Carro(); //construtor implicito

         carro.mostrarInformacoes(); //vai estar tudo vazio, pois ainda nao tem nada

         carro.marca = "Chevrolet";
         carro.modelo = "Omega";
         carro.ano = 1989;

         carro.acelerar();
         carro.frear();
         carro.mostrarInformacoes(); //agr vai aparecer
    }
}
