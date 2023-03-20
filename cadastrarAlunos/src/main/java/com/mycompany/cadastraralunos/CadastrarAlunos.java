package com.mycompany.cadastraralunos;

import java.util.Scanner;

public class CadastrarAlunos {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];
        Turma[] turmas = new Turma[2];
        
        System.out.println("***CADASTRO DE ALUNOS***");
        
        Aluno aluno = null;
        
        for(int i=0; i<3; i++){
            System.out.println("Informe o nome aluno:");
            String nome = ler.next();
            System.out.println("Informe o ID do aluno:");
            int idAluno = ler.nextInt();
            System.out.println("Informe a idade do alno:");
            int idade = ler.nextInt();
            System.out.println("Informe o CEP:");
            int cep = ler.nextInt();
            System.out.println("Informe o documento(RG):");
            int rg = ler.nextInt();
            System.out.println("////////////////////////");
            alunos[i] = new Aluno(nome, idAluno, idade, cep, rg);
        }
        
        System.out.println("***CADASTRO DE TURMA***");
        
        for(int i=0; i<2; i++){
            System.out.println("Informe o ID da turma:");
            int idTurma = ler.nextInt();
            System.out.println("Informe o período da turma:");
            int periodo = ler.nextInt();
            System.out.println("Informe a sala da turma:");
            int sala = ler.nextInt();
            boolean correto = false;
            while (correto == false) {                
                System.out.print("Informe o nome do aluno: ");    
                String nome = ler.next();
                for (int j = 0; j < 2; j++) {
                    if(nome.equals(alunos[j].getNome())){
                        aluno = alunos[j];
                        correto = true;
                        
                    }
                }
                if(correto == false){
                    System.out.println("Aluno não cadastrado");         
                }
            }
            System.out.println("////////////////////////");
            turmas[i] = new Turma(idTurma, periodo, sala, aluno);
        }
        
    }
}