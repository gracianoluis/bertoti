package br.com.fatec.service;

import br.com.fatec.model.Jogo;
 
import java.util.ArrayList;
import java.util.List;

public class BibliotecaJogos {
    private List<Jogo> catalogo = new ArrayList<>();

    public void adicionarJogo(Jogo jogo) {
        catalogo.add(jogo);
    }

    public List<Jogo> filtrarPorGenero(String generoBusca) {
        List<Jogo> encontrados = new ArrayList<>();
        for (Jogo j : catalogo) {
            if (j.getGenero().equals(generoBusca)) {
                encontrados.add(j);
            }
        }
        return encontrados;
    }
}