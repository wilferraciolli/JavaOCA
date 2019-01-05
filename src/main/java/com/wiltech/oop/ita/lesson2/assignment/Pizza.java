package com.wiltech.oop.ita.lesson2.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class Pizza {

    public static Map<String, Integer> ingredientesUsado = new HashMap();
    private int quantidadeDeIngredientes;

    /**
     * Construtor para criar pizza com uma lista de ingredientes
     * @param ingredientes Lista de ingredientes
     */
    public Pizza(String... ingredientes) {
        //adicione cada ingrediente na pizza
        Stream.of(ingredientes)
                .forEach(this::adicionaIngrediente);
    }

    /**
     * adicione um ingrediente na pizza
     * @param ingrediente O ingrediente para adicionar
     */
    public void adicionaIngrediente(String ingrediente) {
        contabilizaIngrediente(ingrediente);
        this.quantidadeDeIngredientes++;
    }

    /**
     * Checa se a pizza nao tem ingredientes
     * @return True se a pizza nao tiver pelo menos um ingrediente
     */
    public boolean pizzaSemIngredientes() {
        return this.quantidadeDeIngredientes == 0;
    }

    /**
     * Calcula preco
     * 2 ingredientes ou menos custam 15 reais, de 3 a 5 ingredientes custam 20 reais e mais de 5 ingredientes custa 23 reais.
     */
    public int getPreco() {
        if (quantidadeDeIngredientes < 3) {
            return 15;
        } else if (quantidadeDeIngredientes < 6) {
            return 20;
        } else {
            return 23;
        }
    }

    private static void contabilizaIngrediente(String ingrediente) {
        ingredientesUsado.put(ingrediente, Objects.isNull(ingredientesUsado.get(ingrediente)) ? 1 : ingredientesUsado.get(ingrediente) + 1);
    }

    public int getQuantidadeDeIngredientes() {
        return quantidadeDeIngredientes;
    }
}
