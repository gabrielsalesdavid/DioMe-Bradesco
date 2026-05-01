package com.project.list.operacoesbasicas;

import java.util.List;
import java.util.ArrayList;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@ToString(callSuper = true)
public class CarrinhoDeCompras {

    private List<Item> itemList;

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                if (item.getNome().equals(nome)) {
                    itensParaRemover.add(item);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("O carrinho está vazio. Nenhum item para remover.");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                valorTotal += item.getPreco() * item.getQuantidade();
            }
            return valorTotal;
        } else {
            throw new IllegalStateException("O carrinho está vazio. Não é possível calcular o valor total.");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: " + item.getQuantidade());
            }
        } else {
            System.out.println("O carrinho está vazio.");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{"
                + "itemList=" + itemList
                + '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Maçã", 3.0, 5);
        carrinho.adicionarItem("Banana", 2.0, 10);
        carrinho.exibirItens();
        System.out.println("Valor Total: " + carrinho.calcularValorTotal());
        carrinho.removerItem("Maçã");
        carrinho.exibirItens();
        System.out.println("Valor Total: " + carrinho.calcularValorTotal());
    }
}
