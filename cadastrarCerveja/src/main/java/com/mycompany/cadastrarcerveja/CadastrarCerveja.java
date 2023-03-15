
package com.mycompany.cadastrarcerveja;

import java.util.Scanner;

public class CadastrarCerveja {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Atributos [] cadastrarCerveja = new Atributos[5];
        
        
        for(int i = 0; i < 5; i++){
            System.out.println("Informe a marca da cerveja: ");
            String marca = ler.next();
            System.out.println("Informe a quantidade de cervejas dessa marca: ");
            int quant = ler.nextInt();
            System.out.println("Informe o tipo utliizando a tabela: ");
            System.out.println("0 - Pilsen");
            System.out.println("1 - Puro Malte");
            System.out.println("2 - Malzbier");
            System.out.println("3 - Dublo Malte");
            System.out.println("4 - Artesanal");
            System.out.println("5 - Sem álcool");
            int tipo = ler.nextInt();
            System.out.println("Informe o fornecedor utilizando a tabela: ");
            System.out.println("0 - AMBEV");
            System.out.println("1 - FEMSA");
            System.out.println("2 - Outros");
            int fornecedor = ler.nextInt();
            System.out.println("Informe o valor de compra: ");
            double valorCompra = ler.nextDouble();
            System.out.println("Informe o valor de venda: ");
            double valorVenda = ler.nextDouble();
            cadastrarCerveja[i] = new Atributos(marca, quant, tipo, fornecedor, valorCompra, valorVenda);
        }
        
        System.out.println("\n\n****Estoque de Carvejas****");
        
        for(int i=0; i<cadastrarCerveja.length ;i++){
            System.out.println("\nNOME \t\t"+cadastrarCerveja[i].getMarca());
            System.out.println("QUANTIDADE \t"+cadastrarCerveja[i].getQuant());
            System.out.print("TIPO \t\t");
            cadastrarCerveja[i].tipoNome();
            System.out.print("FONECEDOR \t");
            cadastrarCerveja[i].fornecedorNome();
            System.out.println("VALOR DE COMPRA "+cadastrarCerveja[i].getValorCompra());
            System.out.println("VALOR DE VENDA \t"+cadastrarCerveja[i].getValorVenda());
        }
        
    }
}