package br.com.devsdoagi.POO.Herança.Exerc2;

import java.sql.Struct;
import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String codigo, String nome, double preco, String dataValidade){
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public boolean estaVencido(String dataAtual){
        return dataValidade.compareTo(dataAtual) < 0;
    }
}
