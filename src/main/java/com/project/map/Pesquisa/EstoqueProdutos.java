package com.project.map.Pesquisa;

import java.util.Map;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EstoqueProdutos {

    private Map<Long, Produto> estoque;

    public void adicionarProduto(long cod, String name, double price, int quantity) {
        estoque.put(cod, new Produto(name, price, quantity));
    }

    public void exibirProduto(long cod) {
        Produto produto = estoque.get(cod);
        if (produto != null) {
            System.out.println(produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        if(!estoque.isEmpty()) {
            for (Produto produto : estoque.values()) {
                valorTotal += produto.getPrice() * produto.getQuantity();
            }
        }
        return valorTotal;
    }

    public Produto obterProduto() {
        Produto produto = null;
        double maiorValor = Double.MIN_VALUE;
        if(!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                if (p.getPrice() * p.getQuantity() > maiorValor) {
                    maiorValor = p.getPrice() * p.getQuantity();
                    produto = p;
                }
            }
        }
        return produto;
    }

    public static void main(String[] args) {
        Produto estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "Produto A", 10.0, 5);
        estoque.adicionarProduto(2L, "Produto B", 20.0, 3);
        estoque.adicionarProduto(3L, "Produto C", 15.0, 4);

        System.out.println("Exibindo produto com código 2:");
        estoque.exibirProduto(2L);

        System.out.println("Valor total do estoque: " + estoque.calcularValorTotal());

        Produto produtoMaisValioso = estoque.obterProduto();
        if (produtoMaisValioso != null) {
            System.out.println("Produto mais valioso: " + produtoMaisValioso);
        } else {
            System.out.println("Estoque vazio.");
        }
    }
}