package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Forma;

public class Circulo implements Forma {

    public double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
