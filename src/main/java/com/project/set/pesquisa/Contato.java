package com.project.set.pesquisa;

@AllArgsConstructor
@Getter
public class Contato {

    private String nome;
    @Setter
    private int numero;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Contato contato)) {
            return false;
        }
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "{" + nome + ", " + numero + "}";
    }
}
