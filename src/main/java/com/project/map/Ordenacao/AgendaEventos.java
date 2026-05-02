package com.project.map.Ordenacao;

import java.time.LocalDate;
import java.util.Map;
import lombok.AllArgsConstructor;
import java.util.TreeMap;
import java.util.Set;

@AllArgsConstructor
public class AgendaEventos {

    private Map<LocalDate, Evento> agenda;

    public void adicionarEvento(LocalDate date, String name, String atraction) {
        Evento evento = new Evento(name, atraction);
        agenda.put(date, evento);
    }

    public void exibirEvento() {
        Map<LocalDate, Evento> sortedAgenda = new TreeMap<>(agenda);
        for (Map.Entry<LocalDate, Evento> entry : sortedAgenda.entrySet()) {
            System.out.println("Data: " + entry.getKey() + ", Evento: " + entry.getValue());
        }
    }

    public void obterEvento() {
        /* Set<LocalDate> keys = agenda.keySet();
        for (LocalDate key : keys) {
            if (key.equals(date)) {
                System.out.println("Evento encontrado: " + agenda.get(key));
                return;
            }
        }
        System.out.println("Evento não encontrado para a data: " + date); */
        // agenda.get();
        LocalDate data = LocalDate.now();
        Map<LocalDate, Evento> sortedAgenda = new TreeMap<>(agenda);
        for (Map.Entry<LocalDate, Evento> entry : sortedAgenda.entrySet()) {
            if (entry.getKey().equals(data)) {
                System.out.println("Evento encontrado: " + entry.getValue());
                return;
            }
        }
        System.out.println("Evento não encontrado para a data: " + data);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Evento agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2024, 7, 20), "Festival de Música", "Banda XYZ");
        agenda.adicionarEvento(LocalDate.of(2024, 8, 15), "Feira de Artesanato", "Artesãos Locais");

        // Imprimir a agenda
        agenda.exibirEvento();
    }
}
