package com.mycompany.cadastraralunos;

public class Aluno {
    
    private String nome;
    private int idAluno;
    private int idade;
    private int cep;
    private int rg;

    public Aluno(String nome, int idAluno, int idade, int cep, int rg) {
        this.nome = nome;
        this.idAluno = idAluno;
        this.idade = idade;
        this.cep = cep;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
    
}
