package br.com.devsdoagi.POO.ClasseObjeto.Exerc3;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia(){
        return (nota1+nota2)/2;
    }

    public String verificarSituacao(){
        double media = calcularMedia();
        if (media >= 6){
            return "Aprovado";
        } else if(media < 6 && media > 2.5){
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public void exibirRelatorio(){
        System.out.println();
        System.out.println("Boletim");
        System.out.println("Nome: " +this.nome);
        System.out.println("Nota 1: " +this.nota1);
        System.out.println("Nota 2: " +this.nota2);
        System.out.println("Media das notas: " +this.calcularMedia());
        System.out.println("Situação: " +this.verificarSituacao());
    }
}
