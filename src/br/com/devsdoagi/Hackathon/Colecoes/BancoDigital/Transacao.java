package br.com.devsdoagi.Hackathon.Colecoes.BancoDigital;

import java.time.LocalDateTime;

public class Transacao {
    private String tipo;
    private double valor;
    private LocalDateTime data;
    private int contaOrigem, contaDestino;


    public Transacao(String tipo, double valor, int contaOrigem, int contaDestino) {
        this.tipo = tipo;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.data = LocalDateTime.now();
    }

    public Transacao(String tipo, double valor) {
        this(tipo, valor, -1, -1); // -1 indica que não há conta origem/destino
    }

    @Override
    public String toString() {
        return data + " | " + tipo + " | Valor: " + valor + " | Origem: " + contaOrigem + " | Destino: " + contaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
