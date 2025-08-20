package br.com.devsdoagi.Vetores;

public class exerc4 {
    public static double[] lucroPorAtivo(double[] compra, double[] venda){
        double lucro[] = new double[compra.length];

        for (int i = 0; i < compra.length; i++){
            lucro[i] = venda[i] - compra[i];
        }
        return lucro;
    }

    public static double lucroTotal(double[] compra, double[] venda) {
        double total = 0.0;
        for (double l : lucroPorAtivo(compra, venda)) //guarda o valor no lucroPorAtivo em l
            total += l; //e para cada lucro l, soma em total
        return total;
    }

    public static double calcularImposto(double lucroTotal){
        double imposto = 0.0;
        if(lucroTotal > 20000){
            imposto = (lucroTotal-20000) * 0.15;
        }
        return imposto;
    }

    public static void main(String[] args) {
        double[] compra = {100, 102, 104, 110, 100};
        double[] venda = {120, 100, 120, 130, 90};

        double[] lucroPorAtivo = lucroPorAtivo(compra, venda);
        System.out.println("Lucro por ativo:");
        for (int i = 0; i < lucroPorAtivo.length; i++) {
            System.out.println("Ativo " + i + ": " + lucroPorAtivo[i]);
        }

        double lucro = lucroTotal(compra, venda);
        System.out.println("Lucro total: " +lucro);
        System.out.println("Imposto: " +calcularImposto(lucro));

    }
}
