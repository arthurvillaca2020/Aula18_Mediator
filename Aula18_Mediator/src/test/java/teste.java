import org.example.Jogador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class teste {
    @Test
    void deveAbrirChamadoDeBugInstancia() {
        Jogador jogador = new Jogador();
        assertEquals("O suporte agradece seu contato.\nO administrador do servidor respondeu sua reclamacao conforme mensagem a seguir.\n" +

                        ">>Estaremos trabalhando para corrigir este bug: Mobs estão aparecendo dentro do chão",
                jogador.reclamarBugInstancia("Mobs estão aparecendo dentro do chão"));
    }

    @Test
    void deveAbrirChamadoDeBugPVP() {
        Jogador jogador = new Jogador();
        assertEquals("O suporte agradece seu contato.\nO administrador do servidor respondeu sua reclamacao conforme mensagem a seguir.\n" +
                        ">>Estaremos verificando este bug agora mesmo: Mago é roubado! Nerfem ele!",
                jogador.reclamarBugPVP("Mago é roubado! Nerfem ele!"));
    }

    @Test
    void deveAbrirSugestaoDeMelhoria() {
        Jogador jogador = new Jogador();
        assertEquals("O suporte agradece seu contato.\nO administrador respondeu sua sugestao conforme mensagem a seguir.\n" +
                        ">>Iremos analisar sua sugestão: Poderia ter mais formas de ganhar gold!",
                jogador.segustaoDeMelhoria("Poderia ter mais formas de ganhar gold!"));
    }
}
