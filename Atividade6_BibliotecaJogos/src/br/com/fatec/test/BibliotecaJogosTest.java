package br.com.fatec.service;

import br.com.fatec.model.Jogo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class BibliotecaJogosTest {

    @Test
    public void testeFiltrarPorGenero() {
        // 1. Cenário (Setup)
        BibliotecaJogos biblioteca = new BibliotecaJogos();
        Jogo jogo1 = new Jogo("Elden Ring", "RPG", 250.0);
        Jogo jogo2 = new Jogo("FIFA", "Esporte", 200.0);

        biblioteca.adicionarJogo(jogo1);
        biblioteca.adicionarJogo(jogo2);

        // 2. Ação (Execução)
        List<Jogo> resultado = biblioteca.filtrarPorGenero("RPG");

        // 3. Verificação (Assert)
        assertEquals(1, resultado.size(), "Deveria encontrar apenas 1 jogo de RPG");
        assertEquals("Elden Ring", resultado.get(0).getTitulo());
    }
}