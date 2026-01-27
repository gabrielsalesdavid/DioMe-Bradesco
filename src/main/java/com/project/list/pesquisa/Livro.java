package com.project.list.pesquisa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString(CallSuper = true)
public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    @Override
    public String toString() {
        return "Livro{"
                + "titulo='" + titulo + '\''
                + ", autor='" + autor + '\''
                + ", anoPublicacao=" + anoPublicacao
                + '}';
    }
}
