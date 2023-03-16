
package com.mycompany.campeonatofutebol;


public class TimeFutebol {
    
    private String nomeTime;
    private int vitorias;
    private int derrotas;
    private int jogosJogados;
    private Jogador capitao;

    public TimeFutebol(String nomeTime, int vitorias, int derrotas, int jogosJogados, Jogador capitao) {
        this.nomeTime = nomeTime;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.jogosJogados = jogosJogados;
        this.capitao = capitao;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getJogosJogados() {
        return jogosJogados;
    }

    public void setJogosJogados(int jogosJogados) {
        this.jogosJogados = jogosJogados;
    }

    public Jogador getCapitao() {
        return capitao;
    }

    public void setCapitao(Jogador capitao) {
        this.capitao = capitao;
    }
    
}
