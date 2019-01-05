package com.wiltech.oop.ita.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarrinhoDeCompras {

    List<Pizza> pizzas = new ArrayList<>();
    private int total;

    public CarrinhoDeCompras(List<Pizza> pizzas) {
        if (temPizzaSemIngrediente(pizzas)) {
            throw new IllegalArgumentException("Todas as pizzas tem que ter pelo memos um ingrediente");
        }

        this.pizzas = pizzas;
    }

    private boolean temPizzaSemIngrediente(List<Pizza> pizzas) {
        return pizzas.stream()
                .filter(Pizza::pizzaSemIngredientes)
                .findFirst()
                .isPresent();
    }

    public int calculaValorTotal() {
        pizzas.stream()
                .forEach(pizza -> total += pizza.getPreco());

        return total;
    }
}
