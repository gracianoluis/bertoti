package br.com.fatec.model;

public class Jogo {
    private String titulo;
    private String genero;
    private double preco;

    public Jogo(String titulo, String genero, double preco) {
        this.titulo = titulo;
        this.genero = genero;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }
}
