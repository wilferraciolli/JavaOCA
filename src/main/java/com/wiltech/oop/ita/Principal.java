package com.wiltech.oop.ita;

/**
 * Initializar objetos de paciente e imprimir o que a classe Paciente pode fazer com eles.
 */
public class Principal {

    public static void main(String[] args) {

        Paciente pacienteAbaixoDoPeso = new Paciente(45, 1.80);
        System.out.println(concatenateResult("abaixo do peso", pacienteAbaixoDoPeso.calcularIMC(), pacienteAbaixoDoPeso.diagnostico()));

        Paciente pacienteAoPesoRecomendado = new Paciente(75, 1.78);
        System.out.println(concatenateResult("ao peso recomendado", pacienteAoPesoRecomendado.calcularIMC(), pacienteAoPesoRecomendado.diagnostico()));


        Paciente pacienteAcimaDoPeso = new Paciente(95, 1.60);
        System.out.println(concatenateResult("acima do peso", pacienteAcimaDoPeso.calcularIMC(), pacienteAcimaDoPeso.diagnostico()));
    }

    private static String concatenateResult(final String paciente, final double imc, final String diagnostico) {
        return String.format("Paciente %s esta com o IMC de %s e seu diagnostico é %s.", paciente, imc, diagnostico);
    }

}
