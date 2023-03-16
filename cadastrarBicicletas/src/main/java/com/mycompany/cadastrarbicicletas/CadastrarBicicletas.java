
package com.mycompany.cadastrarbicicletas;

import java.util.Scanner;

public class CadastrarBicicletas {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Atributos [] cadastrarBicicletas = new Atributos[4];
        
        for(int i=0; i<4; i++){
            System.out.println("Informe o modelo da bicicleta: ");
            String modelo = ler.next();
            System.out.println("Informe a marca: ");
            String marca = ler.next();
            System.out.println("Informe o aro da bicicleta conforme a tabela: ");
            System.out.println("0 - ARO 12");
            System.out.println("1 - ARO 16");
            System.out.println("2 - ARO 20");
            System.out.println("3 - ARO 24");
            System.out.println("4 - ARO 26");
            System.out.println("5 - ARO 27.5");
            System.out.println("6 - ARO 29");
            System.out.println("7 - ARO 700");
            int aro = ler.nextInt();
            System.out.println("Informe a cor da bicicleta: ");
            String cor = ler.next();
            System.out.println("Informe a quantidade de marchas conforme a tabela: ");
            System.out.println("0 - 18 marchas");
            System.out.println("1 - 21 marchas");
            System.out.println("2 - 24 marchas");
            System.out.println("3 - 27 marchas");
            System.out.println("4 - 30 marchas");
            int marcha = ler.nextInt();
            System.out.println("Informe o valor de custo: ");
            double valorCusto = ler.nextDouble();
            System.out.println("Informe o valor de venda: ");
            double valorVenda = ler.nextDouble();
            cadastrarBicicletas[i] = new Atributos(modelo, marca, aro, cor, marcha, valorCusto, valorVenda);
            
        }
        System.out.println("\n\n***ESTOQUE DE BICICLETA***");
        
        for(int i=2; i<cadastrarBicicletas.length;i++){
            System.out.println("__________________________");
            System.out.println("MODELO \t"+cadastrarBicicletas[i].getModelo());
            System.out.println("MARCA \t"+cadastrarBicicletas[i].getMarca());
            System.out.print("ARO \t");
            cadastrarBicicletas[i].aroNum();
            System.out.println("COR \t"+cadastrarBicicletas[i].getCor());
            System.out.print("MARCHA \t");
            cadastrarBicicletas[i].quantMarcha();
            System.out.println("CUSTO \t"+cadastrarBicicletas[i].getValorCusto());
            System.out.println("VENDA \t"+cadastrarBicicletas[i].getValorVenda());
        }
        System.out.println("__________________________");
        
    }
}
