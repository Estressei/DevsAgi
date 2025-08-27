package br.com.devsdoagi.Colecoes;
import java.util.HashMap;
import java.util.Map;

/*
Armazene os saldos dos clientes em um Map<String, Double>, onde a chave é o número da conta e o valor é o saldo.
Métodos sugeridos:
    void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldoInicial) – cadastra um cliente.
    void depositar(Map<String, Double> contas, String numeroConta, double valor) – atualiza o saldo após um depósito.
    void exibirSaldos(Map<String, Double> contas) – exibe todos os clientes com seus saldos.
 */

public class Exerc3 {
    public static void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldoInicial){
        contas.put(numeroConta, saldoInicial);
    }

    public static void depositar(Map<String, Double> contas, String numeroConta, double valor){
        //se a conta existe, vai atualizar o saldo somando como valor
        //se nao existir, vai criar uma conta com saldo valor
        contas.put(numeroConta, contas.getOrDefault(numeroConta, 0.0) + valor);
    }

    public static void exibirSaldos(Map<String, Double> contas){
        contas.forEach((conta,saldo) -> System.out.println("Conta " + conta + " - Saldo: R$ " + saldo));
    }

    public static void main(String[] args) {
        //string é a key - numeroConta e double é o value - saldo
        Map<String, Double> contas = new HashMap<>();

        adicionarCliente(contas, "1234", 1000);
        adicionarCliente(contas, "5678", 1500);

        depositar(contas, "1234", 700);

        exibirSaldos(contas);
    }
}
