package br.com.devsdoagi.Vetores;
import java.util.Scanner;

public class exerc6 {
    public static int[] primeiraTrincaAlta(double[] precos){ //int pois retorna o indice e nao o preço
        for (int i = 0; i < (precos.length-2); i++){
            if ((precos[i] < precos[i+1]) && (precos[i+1] < precos[i+2])){
                return new int[]{i, i+1, i+2};
            }
        }
        return null;
    }

    public static int[] primeiraTendenciaAlta(double[] precos){
        int cont = 1, inicio = 0;
        for (int i = 1; i < precos.length; i++){
            if (precos[i] > precos[i-1]){
                cont++;
            } else {
                if (cont >= 3){
                    break; //se ja achou uma tendencia=3, quebra, pq so precisa da primeira
                } else {
                    inicio = i;
                    cont = 1;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        double[] precos = new double[9];
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os preços da ação nos últimos 10 dias");
        for (int i = 0; i <= precos.length; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            precos[i] = scan.nextDouble();
        }
    }
    //double[] precos = {6.6, 5.4, 3.3, 3.6, 6.1, 8.7, 8.8, 8.9, 7.7, 5.9}; //declarando e atribuindo

}
