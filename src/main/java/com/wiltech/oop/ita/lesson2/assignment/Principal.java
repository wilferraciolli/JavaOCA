package com.wiltech.oop.ita.lesson2.assignment;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        //cria pizzas
        Pizza frango = new Pizza("frango", "Catupiry");
        Pizza calabreasa = new Pizza("Calabresa", "Cebola", "Azeitonas");
        Pizza mista = new Pizza("Calabresa", "Frango", "Hamburguer", "Kebab", "Batata", "Cebola", "Pimenta Fresca");

        //adiciona ao carrinho e imprime o valor
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(Arrays.asList(frango,calabreasa,mista));
        System.out.println(carrinho.calculaValorTotal());

        //imprime a quantidade de ingredientses usado
        System.out.println(Pizza.ingredientesUsado);
    }
}
