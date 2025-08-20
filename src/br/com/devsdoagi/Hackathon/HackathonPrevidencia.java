package br.com.devsdoagi.Hackathon;
import java.util.Arrays;
import java.util.Scanner;

public class HackathonPrevidencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        // Variáveis principais (poderão ser preenchidas na opção 1)
        int idadeAtual = 0, idadeAposentadoria = 0, expectativaVida = 0;
        double contribuicaoMensal = 0;
        double taxaMensal = 0;
        double[] saldoAnual = null;
        double[][] matrizCenarios = null;
        double[] rendaMensal = null;

        do {
            System.out.println("\n===== MENU SIMULADOR DE PREVIDÊNCIA =====");
            System.out.println("1 - Inserir dados");
            System.out.println("2 - Calcular saldo anual (vetor)");
            System.out.println("3 - Gerar matriz de cenários");
            System.out.println("4 - Calcular renda mensal na aposentadoria");
            System.out.println("5 - Exibir todos os resultados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite sua idade: ");
                    idadeAtual = sc.nextInt();

                    System.out.println("Digite sua idade desejada para aposentadoria: ");
                    idadeAposentadoria = sc.nextInt();

                    System.out.println("Digite sua expectativa de vida: ");
                    expectativaVida = sc.nextInt();

                    System.out.println("Digite sua contribuição mensal: ");
                    contribuicaoMensal = sc.nextDouble();

                    System.out.println("Digite a taxa de juros ");
                    taxaMensal = sc.nextDouble();

                    expectativaVida -= idadeAposentadoria;
                    break;

                case 2:
                    calcularSaldoAnual(idadeAtual, idadeAposentadoria, contribuicaoMensal,taxaMensal,expectativaVida);
                    System.out.println("Calculo do seu saldo anual é de: " +calcularSaldoAnual(idadeAtual, idadeAposentadoria, contribuicaoMensal, taxaMensal, expectativaVida));
                    System.out.println(Arrays.toString(calcularSaldoAnual(idadeAtual, idadeAposentadoria, contribuicaoMensal, taxaMensal, expectativaVida)));
                    break;

                case 3:
                    // >>> CHAMAR O METODO gerarMatrizCenarios() e armazenar na matriz matrizCenarios
                    break;

                case 4:
                    // >>> CHAMAR O METODO calcularRendaMensal() e armazenar no vetor rendaMensal
                    break;

                case 5:
                    // >>> CHAMAR O METODO exibirResultados() para mostrar tudo
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("⚠ Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }

    // ================================
    // ===== MÉTODOS ESTÁTICOS ========
    // ================================

    // 1. Cálculo do saldo acumulado ano a ano (Vetor)
    public static double[] calcularSaldoAnual(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double taxaMensal, int expectativaVida) {
        double[] saldoAnual = new double[expectativaVida];
        double anocontribuicao = idadeAposentadoria - idadeAtual;
        double mesesContribuicao = 0;

        taxaMensal /= 100;

        for (int ano = 1; ano <= anocontribuicao; ano++) {
            mesesContribuicao = ano * 12; //1 ano tem 12 meses, 2 ano tem 24 meses e assim por diante
            saldoAnual[ano-1] = contribuicaoMensal * (Math.pow(1 + taxaMensal, mesesContribuicao) - 1) / taxaMensal;
        }

        return saldoAnual;
    }

    // 2. Projeção com cenários diferentes (Matriz)
    public static double[][] gerarMatrizCenarios(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double[] taxasAnuais) {
        // >>> IMPLEMENTAR O CÁLCULO DA MATRIZ DE CENÁRIOS
        return null;
    }

    // 3. Cálculo da renda mensal na aposentadoria
    public static double[] calcularRendaMensal(double[][] matrizCenarios, double[] taxasAnuais, int expectativaVida) {
        // >>> IMPLEMENTAR O CÁLCULO DA RENDA MENSAL PARA CADA CENÁRIO
        return null;
    }

    // 4. Exibir todos os resultados
    public static void exibirResultados(double[] saldoAnual, double[][] matrizCenarios, double[] taxasAnuais, double[] rendaMensal) {
        // >>> IMPLEMENTAR A EXIBIÇÃO DOS RESULTADOS
    }
}


