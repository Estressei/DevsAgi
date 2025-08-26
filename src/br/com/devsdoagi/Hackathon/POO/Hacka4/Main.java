package br.com.devsdoagi.Hackathon.POO.Hacka4;

import br.com.devsdoagi.Hackathon.POO.Hacka3.Funcionario;

public class Main {
    public static void main(String[] args) {
        //criando o vetor e ja inicializando com os objetos
        Investimento[] invest = {
                new RendaFixa(1000),
                new RendaVariavel(1000)
        };
        //percorre todos os elementos do vetor
        //para cada objeto i do tipo Investimento em invest faça…
        for(Investimento i : invest){
            System.out.println("Valor do rendimento: " +i.calcularRendimento());
        }
    }
}
