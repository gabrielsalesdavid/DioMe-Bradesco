package com.project.map.Ordenacao;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Evento {
    private String name;
    private String atraction;

    @Override
    public String toString() {
        return "Evento{name='" + name + "', atraction='" + atraction + "'}";
    }
}