package com.mycompany.cadastraradvogados;

public class Advogados {
    
    public String nome;
    public int cna;
    private int tempoCarreira;
    private String especializacao;
    private String formacao;
    private String cidade;
    private String estado;

    public Advogados(String nome, int cna) {
        this.nome = nome;
        this.cna = cna;
    }

    public int getTempoCarreira() {
        return tempoCarreira;
    }

    public void setTempoCarreira(int tempoCarreira) {
        this.tempoCarreira = tempoCarreira;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
