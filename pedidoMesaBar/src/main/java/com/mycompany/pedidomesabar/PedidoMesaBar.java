
package com.mycompany.pedidomesabar;

import java.util.Scanner;

public class PedidoMesaBar {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        CadastrarPedido[] pedidosMesaBar = new CadastrarPedido[5];
        
        System.out.println("***Cadastre os cinco últimos pedidos***");
        
        double total = 0.0;
        
        for(int i=0; i<5; i++){
            System.out.println("Informe o nome do cliente:");
            String nomeCliente = ler.next();
            System.out.println("Informe o número da mesa:");
            int mesa = ler.nextInt();
            System.out.println("Informe o item conforme a tabela abaixo:");
            System.out.println("0 - Cerveja");
            System.out.println("1 - Refrigerante");
            System.out.println("2 - Porção");
            System.out.println("3 - Lanche");
            System.out.println("4 - Outros ");
            int codItem = ler.nextInt();
            System.out.println("Informe a quantidade de itens:");
            int quantItem = ler.nextInt();
            System.out.println("Informe o valor unitário do item escolhido:");
            double valorUnitario = ler.nextDouble();
            pedidosMesaBar[i] = new CadastrarPedido(nomeCliente, mesa, codItem, quantItem, valorUnitario);
            
            pedidosMesaBar[i].CalcularPedido();
            total += pedidosMesaBar[i].getValorTotalPedido();
        }
      
        System.out.println("O valor dos 5 pedidos é R$"+total);
    }
}
