package com.project.list.pesquisa;

import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class CatalogoLivros {

    private List<Livro> livroList = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livroList.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
            return livrosPorAutor;
        } else {
            throw new IllegalStateException("O catálogo de livros está vazio.");
        }
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFim) {
        List<Livro> livrosNoIntervalo = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFim) {
                    livrosNoIntervalo.add(livro);
                }
            }
            return livrosNoIntervalo;
        } else {
            throw new IllegalStateException("O catálogo de livros está vazio.");
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
            return livroPorTitulo;
        } else {
            throw new IllegalStateException("O catálogo de livros está vazio.");
        }
    }

    public static void main(String[] args) {

        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("1984", "George Orwell", 1949);
        catalogo.adicionarLivro("To Kill a Mockingbird", "Harper Lee", 1960);
        catalogo.adicionarLivro("Brave New World", "Aldous Huxley", 1932);

        List<Livro> livrosOrwell = catalogo.pesquisarPorAutor("George Orwell");
        System.out.println("Livros de George Orwell: " + livrosOrwell.size());

        List<Livro> livrosAnos50 = catalogo.pesquisarPorIntervaloAno(1950, 1960);
        System.out.println("Livros publicados entre 1950 e 1960: " + livrosAnos50.size());

        Livro livroTitulo = catalogo.pesquisarPorTitulo("1984");
        System.out.println("Livro encontrado com título '1984': " + (livroTitulo != null));

        System.out.println(catalogo.pesquisarPorTitulo("O Senhor dos Anéis"));
        System.out.println(catalogo.pesquisarPorAutor("J.K. Rowling"));
        System.out.println(catalogo.pesquisarPorIntervaloAno(1950, 1960));
        System.out.println(catalogo.pesquisarPorTitulo("1984"));
        System.out.println(catalogo.pesquisarPorAutor("George Orwell"));
        System.out.println(catalogo.pesquisarPorIntervaloAno(1930, 1950));
    }
}
