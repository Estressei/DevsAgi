package br.com.devsdoagi.Hackathon.Colecoes.BancoDigital;

import java.util.*;

public class BancoDigitalHackaton {
    private static Set<Cliente> clientes = new HashSet<>();
    private static Map<Integer, Conta> contas = new HashMap<>();
    private static int numeroConta = 1001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n✨🏦=== MENU BANCO DIGITAL ===🏦✨");
            System.out.println("👤 1 - Cadastrar Cliente");
            System.out.println("💳 2 - Cadastrar Conta");
            System.out.println("💰 3 - Depósito");
            System.out.println("💸 4 - Saque");
            System.out.println("🔄 5 - Transferência");
            System.out.println("📊 6 - Consultar Saldo");
            System.out.println("🧾 7 - Extrato");
            System.out.println("📋 8 - Listar Clientes");
            System.out.println("🚪 9 - Sair");
            System.out.print("👉 Escolha: ");

            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    cadastrarCliente(sc);
                    break;
                case 2:
                    cadastrarConta(sc);
                    break;
                case 3:
                    deposito(sc);
                    break;
                case 4:
                    saque(sc);
                    break;
                case 5:
                    transferencia(sc);
                    break;
                case 6:
                    consultarSaldo(sc);
                    break;
                case 7:
                    extrato(sc);
                    break;
                case 8:
                    listarClientes();
                    break;
                case 9:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }

    private static void cadastrarCliente(Scanner sc) {
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();

        Cliente cli = new Cliente(nome, cpf);

        if(clientes.contains(cli)){ //se cli ja existir em clientes
            System.out.println("Não foi possivel cadastrar cliente. CPF já esta cadastrado!");
        } else{
            clientes.add(cli); //clientes é do Set<Cliente>
            System.out.println("Cliente cadastrado com sucesso!");
        }
    }

    private static void cadastrarConta(Scanner sc) {
        System.out.println("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();

        //busca cliente pelo CPF
        Cliente clienteEncontrado = null;
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado == null) {
            System.out.println("Cliente não encontrado. Cadastre o cliente primeiro!");
            return;
        }

        // Cria conta e adiciona no Map usando numeroConta como chave
        Conta conta = new Conta(numeroConta, clienteEncontrado, 0.0);
        contas.put(numeroConta, conta);
        System.out.println("Conta criada com sucesso! Número da conta: " + numeroConta);
        numeroConta++; // incrementa para próxima conta
    }

    private static void deposito(Scanner sc) {
        System.out.println("Digite o número da conta: ");
        int numeroContaDeposito = sc.nextInt();
        sc.nextLine(); //limpar o buffer

        Conta conta = contas.get(numeroContaDeposito); //buscar a conta no Map
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.println("Digite o valor do depósito: ");
        double valor = sc.nextDouble();
        sc.nextLine(); // Limpar o buffer

        if (valor > 0) {
            conta.setSaldo(conta.getSaldo() + valor); // atualiza saldo
            conta.getExtrato().add(new Transacao("Depósito", valor));
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    private static void saque(Scanner sc) {
        System.out.println("Digite o número da conta: ");
        int numeroContaSaque = sc.nextInt();
        sc.nextLine(); // limpar buffer

        Conta conta = contas.get(numeroContaSaque);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.println("Digite o valor do saque: ");
        double valor = sc.nextDouble();
        sc.nextLine(); // limpar buffer

        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor); // atualiza saldo
            conta.getExtrato().add(new Transacao("Saque", -valor)); // registra no extrato
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente. Saldo disponível: R$ " + conta.getSaldo());
        }
    }

    private static void transferencia(Scanner sc) {
        System.out.println("Conta origem: ");
        int contaOrigem = sc.nextInt();

        System.out.println("Conta destino: ");
        int contaDestino = sc.nextInt();
        sc.nextLine(); // limpar buffer

        Conta getOrigem = contas.get(contaOrigem);
        Conta getDestino = contas.get(contaDestino);

        if (getOrigem == null || getDestino == null) {
            System.out.println("Contas não existe.");
            return;
        }

        System.out.println("Digite o valor da transferência: ");
        double valorTransferencia = sc.nextDouble();
        sc.nextLine();

        if (valorTransferencia <= 0) {
            System.out.println("Valor inválido!");
            return;
        }

        if (getOrigem.getSaldo() >= valorTransferencia) {
            getOrigem.setSaldo(getOrigem.getSaldo() - valorTransferencia);
            getDestino.setSaldo(getDestino.getSaldo() + valorTransferencia);

            getOrigem.getExtrato().add(new Transacao("Transferência enviada", -valorTransferencia));
            getDestino.getExtrato().add(new Transacao("Transferência recebida", valorTransferencia));

            System.out.println("Transferência de R$ " + valorTransferencia + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente na conta de origem. Saldo disponível: R$ " + getOrigem.getSaldo());
        }
    }

    private static void consultarSaldo(Scanner sc) {
        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        Conta conta = contas.get(numero);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.println("Saldo da conta " + conta.getNumeroConta() + " - Titular: " + conta.getTitular() +
                " é R$ " + conta.getSaldo());
    }

    private static void extrato(Scanner sc) {
        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        Conta conta = contas.get(numero);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.println("Extrato da conta " + conta.getNumeroConta() + " - Titular: " + conta.getTitular());
        if (conta.getExtrato().isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            for (Transacao t : conta.getExtrato()) {
                System.out.println(t);
            }
        }
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }

    private static void listarClientes() {
        clientes.forEach(System.out::println); //mesma coisa que System.out.println(cliente), mas usando :: percorre todos clientes dentro de Cliente
    }
}

