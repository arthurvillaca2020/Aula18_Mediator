package org.example;

public class Pessoa {
    public String reclamarBugInstancia(String mensagem) {
        return TicketSuporte.getInstancia().receberReclamacaoBugInstancia(mensagem);
    }

    public String reclamarBugPVP(String mensagem) {
        return TicketSuporte.getInstancia().receberReclamacaoBugPVP(mensagem);
    }

    public String segustaoDeMelhoria(String mensagem) {
        return TicketSuporte.getInstancia().receberSugestaoDeMelhoria(mensagem);
    }
}
