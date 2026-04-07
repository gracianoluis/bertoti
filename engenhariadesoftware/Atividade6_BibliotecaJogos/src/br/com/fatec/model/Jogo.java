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

    // Método de Baixo Acoplamento
    public boolean temOGenero(String busca) {
        return this.genero.equalsIgnoreCase(busca);
    }
    public String getTitulo() { return titulo; }
}
