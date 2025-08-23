package br.com.devsdoagi.Hackathon.POO.Hacka2;

public abstract class Produto implements OperacoesProduto{
    private int codigo;
    private String nome;
    private double preco;
    private String clienteComprador;

    //construtor
    public Produto(int codigo, String nome, double preco, String clienteComprador){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.clienteComprador = clienteComprador;
    }

    //getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(){
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getClienteComprador() {
        return clienteComprador;
    }

    public void setClienteComprador(String clienteComprador) {
        this.clienteComprador = clienteComprador;
    }

    //metodo da interface
    @Override
    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual/100);
    }

    @Override
    public void aumentarPreco(double percentual){
        preco += preco * (percentual/100);
    }

    //metodo abstratoi
    public abstract double calcularFrete();
}
