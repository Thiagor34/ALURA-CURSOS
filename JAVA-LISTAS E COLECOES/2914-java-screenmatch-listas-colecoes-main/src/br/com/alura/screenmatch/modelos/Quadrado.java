package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Forma;

public class Quadrado implements Forma {
    public double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
