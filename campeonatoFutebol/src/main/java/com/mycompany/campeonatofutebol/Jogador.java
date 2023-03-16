
package com.mycompany.campeonatofutebol;


public class Jogador {
    
    private String nomeJogador;
    private int numero;
    private int gols;
    private int assistencias;
    private String posicao;

    public Jogador(String nomeJogador, int numero, int gols, int assistencias, String posicao) {
        this.nomeJogador = nomeJogador;
        this.numero = numero;
        this.gols = gols;
        this.assistencias = assistencias;
        this.posicao = posicao;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
}
