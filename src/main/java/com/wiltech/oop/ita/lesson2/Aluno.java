package com.wiltech.oop.ita.lesson2;

public class Aluno {

    int bim1;
    int bim2;
    int bim3;
    int bim4;

    public int media() {
        int total = 0;

        //add every bimester and divide by 4 to g get the medium
        total += bim1;
        total += bim2;
        total += bim3;
        total += bim4;

        return total / 4;
    }

    public   boolean passouDeAno(){
        if (media() >= 60){
            return true;
        }
        return false;
    }
}
