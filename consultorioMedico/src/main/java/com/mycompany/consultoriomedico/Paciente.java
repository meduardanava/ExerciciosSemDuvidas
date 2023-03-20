package com.mycompany.consultoriomedico;

public class Paciente {
    
    private String nomePaciente;
    private int idade;
    private int documento;
    private double peso;
    private Sintoma sintomaPaciente;

    public Paciente(String nomePaciente, int idade, int documento, double peso, Sintoma sintomaPaciente) {
        this.nomePaciente = nomePaciente;
        this.idade = idade;
        this.documento = documento;
        this.peso = peso;
        this.sintomaPaciente = sintomaPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Sintoma getSintomaPaciente() {
        return sintomaPaciente;
    }

    public void setSintomaPaciente(Sintoma sintomaPaciente) {
        this.sintomaPaciente = sintomaPaciente;
    }

}