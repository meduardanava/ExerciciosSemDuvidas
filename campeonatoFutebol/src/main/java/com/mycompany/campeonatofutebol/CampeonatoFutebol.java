
package com.mycompany.campeonatofutebol;

import java.util.Scanner;


public class CampeonatoFutebol {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Jogador[] jogadores = new Jogador[5];
        TimeFutebol[] time = new TimeFutebol[2];
        
       Jogador capitao = null;
        
        System.out.println("**Cadastro de jogador**");
        
        for(int i=0; i<5; i++){
            System.out.println("Informe o nome do jogador: ");
            String nomeJogador = ler.next();
            System.out.println("Informe o número do jogador: ");
            int numero = ler.nextInt();
            System.out.println("Informe a quantidade de gols marcados: ");
            int gols = ler.nextInt();
            System.out.println("Informe a quantidade de assistencias: ");
            int assistencias = ler.nextInt();
            System.out.println("Informe a posição do jogador: ");
            String posicao = ler.next();
            jogadores[i] = new Jogador(nomeJogador, numero, gols, assistencias, posicao);
        }
        System.out.println("**Cadastro de jogadores encerrado**");
        System.out.println("\n___________________________________\n");
        System.out.println("**Cadastro de time**");
        
        for(int i=0; i<2; i++){
            System.out.println("Informe o nome do time: ");
            String nomeTime = ler.next();
            System.out.println("Informe a quantidade de vitórias: ");
            int vitorias = ler.nextInt();
            System.out.println("Informe a quantidade de derrotas: ");
            int derrotas = ler.nextInt();
            System.out.println("Informe a quantidade de jogos jogados: ");
            int jogosJogados = ler.nextInt();
            boolean correto = false;
            while (correto == false) {                
                System.out.print("Informe o capitão do Time: ");    
                String nomeJogador = ler.next();
                for (int j = 0; j < 5; j++) {
                    if(nomeJogador.equals(jogadores[j].getNomeJogador())){
                        capitao = jogadores[j];
                        correto = true;
                    }
                }
            }
            time[i] = new TimeFutebol(nomeTime, vitorias, derrotas, jogosJogados, capitao);
        }
        
        System.out.println("\t***Jogo do Dia***");
        System.out.println(" "+time[0].getNomeTime()+" X "+time[1].getNomeTime());
        System.out.println("________________________________________________");
        System.out.print("\t");
        System.out.print(time[0].getNomeTime());
        System.out.println("\nVitórias: \t"+time[0].getVitorias());
        System.out.println("Derrotas: \t"+time[0].getDerrotas());
        System.out.println("Jogos Jogados:\t"+time[0].getJogosJogados());
        System.out.println("Capitao: \t"+time[0].getCapitao().getNomeJogador());
        System.out.println("________________________________________________");
        System.out.print("\t");
        System.out.print(time[1].getNomeTime());
        System.out.println("Vitórias: \t"+time[1].getVitorias());
        System.out.println("Derrotas: \t"+time[1].getDerrotas());
        System.out.println("Jogos Jogados:\t"+time[1].getJogosJogados());
        System.out.println("Capitao: \t"+time[1].getCapitao().getNomeJogador());
    }
}