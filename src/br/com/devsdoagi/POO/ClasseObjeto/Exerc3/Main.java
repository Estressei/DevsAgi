package br.com.devsdoagi.POO.ClasseObjeto.Exerc3;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Pietra";
        a1.nota1 = 7.0;
        a1.nota2 = 8.0;
        a1.calcularMedia();
        a1.verificarSituacao();
        a1.exibirRelatorio();

        Aluno a2 = new Aluno();
        a2.nome ="Aninha";
        a2.nota1 = 7.0;
        a2.nota2 = 3.0;
        a2.calcularMedia();
        a2.verificarSituacao();
        a2.exibirRelatorio();;
    }
}
