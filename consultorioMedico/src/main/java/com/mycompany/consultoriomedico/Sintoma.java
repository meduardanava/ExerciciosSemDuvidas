package com.mycompany.consultoriomedico;

public class Sintoma {
    
    private String nomeSintoma;
    private int gravidade;
    private char emergencial;
    private char internamento;

    public Sintoma(String nomeSintoma, int gravidade, char emergencial, char internamento) {
        this.nomeSintoma = nomeSintoma;
        this.gravidade = gravidade;
        this.emergencial = emergencial;
        this.internamento = internamento;
        
    }

    public String getNomeSintoma() {
        return nomeSintoma;
    }

    public void setNomeSintoma(String nomeSintoma) {
        this.nomeSintoma = nomeSintoma;
    }

    public int getGravidade() {
        return gravidade;
    }

    public void setGravidade(int gravidade) {
        this.gravidade = gravidade;
    }

    public char getEmergencial() {
        return emergencial;
    }

    public void setEmergencial(char emergencial) {
        this.emergencial = emergencial;
    }

    public char getInternamento() {
        return internamento;
    }

    public void setInternamento(char internamento) {
        this.internamento = internamento;
    }
}

    