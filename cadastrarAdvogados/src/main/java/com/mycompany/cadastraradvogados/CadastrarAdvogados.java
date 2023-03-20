package com.mycompany.cadastraradvogados;

import java.util.Scanner;

public class CadastrarAdvogados {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Advogados[] cadastrarAdvogados = new Advogados[8];
        
        System.out.println("***CADASTRO DE ADVOGADOS***");
        
        for(int i=0; i<8; i++){
            String nome = " ";
            int cna = 0;
             while(nome.isEmpty() || nome.isBlank() || cna == 0 || cna < 0){
                System.out.print("Informe o nome do Advogado: ");
                nome = ler.next();
                System.out.print("Informe o CNA(Cadastro Nacional dos Advogados: ");
                cna = ler.nextInt();
                if (nome.isEmpty() || nome.isBlank() || cna == 0 || cna < 0) {
                    System.out.println("");
                    System.out.println("Erro ao cadastrar! Informe corretamente NOME e CNA.");
                    System.out.println("");
                }
            }
            cadastrarAdvogados[i] = new Advogados(nome, cna);
            
            System.out.print("Informe quanto tempo de carreira(em mese):");
            int tempoCarreira = ler.nextInt();
            cadastrarAdvogados[i].setTempoCarreira(tempoCarreira);
            System.out.print("Informe a especialização:");
            String especializacao = ler.next();
            cadastrarAdvogados[i].setEspecializacao(especializacao);
            System.out.print("Informe a formação:");
            String formacao = ler.next();
            cadastrarAdvogados[i].setFormacao(formacao);
            System.out.print("Informe a cidade de atuação:");
            String cidade = ler.next();
            cadastrarAdvogados[i].setCidade(cidade);
            System.out.print("Informe o estado:");
            String estado = ler.next();
            cadastrarAdvogados[i].setEstado(estado);
            
        }
        System.out.println("//////////////////");
        
        for(int i=5;i<cadastrarAdvogados.length;i++){
            System.out.println("NOME: "+cadastrarAdvogados[i].nome+"|CNA: "
                    +cadastrarAdvogados[i].cna+"|Tempo de Carreira(meses): "+cadastrarAdvogados[i].getTempoCarreira()
                    +"|Especialização: "+cadastrarAdvogados[i].getEspecializacao()+"|Formação: "
                    +cadastrarAdvogados[i].getFormacao()+"Cidade: "+cadastrarAdvogados[i].getCidade()
                    +"|Estado: "+cadastrarAdvogados[i].getEstado());
        }
        
    }
}
