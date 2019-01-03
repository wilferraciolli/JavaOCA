package com.wiltech.oop.ita.lesson2;

public class VerificadoraDeNotas {

    //This is the imperative way oif doing.
    //Because we are passing an object, we are doing it the imperative way. To do it OOP we would implement theses methods on the class itself
    public static int mediaAluno(Aluno aluno) {
        int total = 0;

        //add every bimester and divide by 4 to g get the medium
        total += aluno.bim1;
        total += aluno.bim2;
        total += aluno.bim3;
        total += aluno.bim4;

        return total / 4;
    }

    public static  boolean passouDeAno(Aluno aluno){
        int media = mediaAluno(aluno);
        if (media >= 60){
            return true;
        }
        return false;
    }
}
