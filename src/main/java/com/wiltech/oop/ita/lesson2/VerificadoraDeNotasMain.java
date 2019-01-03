package com.wiltech.oop.ita.lesson2;

public class VerificadoraDeNotasMain {

    public static void main(String[] args) {
        Aluno guerra = new Aluno();
        guerra.bim1 = 70;
        guerra.bim2 = 60;
        guerra.bim3 = 80;
        guerra.bim4 = 70;

        System.out.println(VerificadoraDeNotas.mediaAluno(guerra));
        System.out.println(VerificadoraDeNotas.passouDeAno(guerra));
    }
}
