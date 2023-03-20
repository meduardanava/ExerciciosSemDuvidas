package com.mycompany.consultoriomedico;

import java.util.Scanner;

public class ConsultorioMedico {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Paciente[] pacientes = new Paciente[6];
        Sintoma[] sintomas = new Sintoma[6];
        
        System.out.println("***CADASTRO DE SISTOMAS***");
        
        Sintoma sintoma = null;
        
        for(int i=0; i<6; i++){
            System.out.println("Informe o sintoma:");
            String nomeSintoma = ler.next();
            System.out.println("Informe a gravidade desse sintoma de 1 a 5:");
            int gravidade = ler.nextInt();
            System.out.println("É um sintoma emergencial?");
            System.out.println("'S' para sim");
            System.out.println("'N' para não");
            char emergencial = ler.next().charAt(0);
            System.out.println("É nessesário internamento?");
            System.out.println("'S' para sim");
            System.out.println("'N' para não");
            char internamento = ler.next().charAt(0);
            System.out.println("///////////////////////////");
            sintomas[i] = new Sintoma(nomeSintoma, gravidade, emergencial, internamento);
        }
        
        for(int i=0; i<6; i++){
            System.out.println("Informe o nome do Paciente:");
            String nomePaciente = ler.next();
            System.out.println("Informe a idade:");
            int idade = ler.nextInt();
            System.out.println("Informe um documento(RG ou CPF):");
            int documento = ler.nextInt();
            System.out.println("Informe o peso do Paciente:");
            double peso = ler.nextDouble();
            boolean correto = false;
            while (correto == false) {                
                System.out.print("Informe sintoma do paciente: ");    
                String nomeSintoma = ler.next();
                for (int j = 0; j < 6; j++) {
                    if(nomeSintoma.equals(sintomas[j].getNomeSintoma())){
                        sintoma = sintomas[j];
                        correto = true;
                        
                    }
                }
                if(correto == false){
                    System.out.println("sintoma não encontrado");         
                }
            }
        }
    }
}
