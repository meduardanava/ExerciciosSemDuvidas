package com.mycompany.cadastraralunos;

public class Turma {
    
    private int idTurma;
    private int periodo;
    private int sala;
    private Aluno aluno;

    public Turma(int idTurma, int periodo, int sala, Aluno aluno) {
        this.idTurma = idTurma;
        this.periodo = periodo;
        this.sala = sala;
        this.aluno = aluno;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setProfRegente(int periodo) {
        this.periodo = periodo;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    

}
