package br.com.alura.screenmatch.modelos;

public class Cachorro extends Animal{
    private String som;

    public Cachorro(String som, String especie) {
        super(especie);
        this.som = som;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "som='" + som + '\'' +
                '}';
    }
}
