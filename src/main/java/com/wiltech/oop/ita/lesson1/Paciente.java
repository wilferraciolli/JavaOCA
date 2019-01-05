package com.wiltech.oop.ita.lesson1;

/**
 * Classe para conter dados for a paciente sobre o BMI deles.
 * Essa classe pode calcular o BMI baseado na altura e peso do paciente.
 */
public class Paciente {

    private double peso;
    private double altura;

    /**
     * Instantiate a new Paciente with height and weight.
     */
    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * calculate BMI
     * IMC = peso (quilos) / (altura * altura (metros)).
     */
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    /**
     * diagnose the patient based on their's BMI.
     *
     * @return Diagnostico do paciente.
     */
    public String diagnostico() {
        double imc = calcularIMC();

        //retorna diagnostico baseado no bmi
        if (imc < 16) {
            return "Baixo peso muito grave";
        } else if (imc >= 16 && imc <= 16.99) {
            return "Baixo peso grave";
        } else if (imc >= 17 && imc <= 18.49) {
            return "Baixo peso";
        } else if (imc >= 18.50 && imc <= 24.99) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.99) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.99) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc <= 39.99) {
            return "Obesidade grau II";
        }

        return "Obesidade grau III (obesidade mórbida)";
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}

