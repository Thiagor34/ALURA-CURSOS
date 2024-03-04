package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.Forma;
import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;

public class PrincipalDesafio {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Thiago");
        nomes.add("Jonathan");
        nomes.add("Gusthavo");
        nomes.add("Pedro");
        nomes.add("Mauricio");

        for (String nome: nomes) {
            System.out.println(nome);
        }

        Cachorro cachorro = new Cachorro("latido", "mamífero");
        Animal animal = (Animal) cachorro;


        Animal animal1 = new Cachorro("latido", "mamífero");
        if (animal1 instanceof Cachorro) {
            Cachorro cachorro1 = (Cachorro) animal1;
        } else {
            System.out.println("O Objeto não é um Cachorro");
        }




        Produto produto1 = new Produto("Ar", 1500.00);
        Produto produto2 = new Produto("Fogão", 500.00);
        Produto produto3 = new Produto("Geladeira", 3600.00);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        double somaPrecos = 0;
        for (Produto produto: produtos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / produtos.size();
        System.out.println("Média de preço: " + precoMedio);


        Circulo circulo= new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        ArrayList<Forma> listaFormas = new ArrayList<Forma>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (Forma forma: listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }

        ContaBancaria contaBancaria1 = new ContaBancaria(123L, 125.55);
        ContaBancaria contaBancaria2 = new ContaBancaria(456L, 14456.77);
        ContaBancaria contaBancaria3 = new ContaBancaria(789L, 9888.63);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(contaBancaria1);
        listaContas.add(contaBancaria2);
        listaContas.add(contaBancaria3);

        ContaBancaria maiorSaldo = listaContas.get(0);

        for (ContaBancaria conta: listaContas) {
            if(conta.getSaldo() > maiorSaldo.getSaldo()){
                maiorSaldo = conta;
            }
        }

        System.out.println("Maior saldo: " + maiorSaldo.getSaldo());
    }
}
