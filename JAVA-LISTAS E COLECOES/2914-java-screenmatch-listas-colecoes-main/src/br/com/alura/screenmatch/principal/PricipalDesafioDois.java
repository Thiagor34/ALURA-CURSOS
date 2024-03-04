package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PricipalDesafioDois {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(10);
        numeros.add(2);
        numeros.add(7);
        numeros.add(5);

        Collections.sort(numeros);
        System.out.println(numeros);

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filmeDoThiago = new Filme("Teste", 2023);
        filmeDoThiago.avalia(7);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoThiago);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        Collections.sort(lista);
        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome());
        }


        List<Integer> numerosDois = new LinkedList<>();
        numerosDois.add(1);
        numerosDois.add(10);
        numerosDois.add(2);
        numerosDois.add(7);
        numerosDois.add(5);

        Collections.sort(numerosDois);
        System.out.println(numerosDois);


        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);

    }
}
