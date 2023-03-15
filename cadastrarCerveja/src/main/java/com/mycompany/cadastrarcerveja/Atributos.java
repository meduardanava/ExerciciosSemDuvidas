
package com.mycompany.cadastrarcerveja;

public class Atributos {

        public String marca; 
        public int quant;
        public int tipo;
        public int fornecedor;
        private double valorCompra;
        private double valorVenda;

        public Atributos(String marca, int quant, int tipo, int fornecedor, double valorCompra, double valorVenda){
            this.marca = marca;
            this.quant = quant;
            this.tipo = tipo;
            this.fornecedor = fornecedor;
            this.valorCompra = valorCompra;
            this.valorVenda = valorVenda;
        }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    public void tipoNome(){
        if(tipo == 0){
            System.out.println("PILSEN");
        }else if(tipo == 1){
            System.out.println("PURO MALTE");   
        }else if(tipo == 2){
            System.out.println("MALZBIER");
        }else if(tipo == 3){
            System.out.println("DUPLO MALTE");
        }else if(tipo == 4){
            System.out.println("ARTESANAL");
        }else if(tipo == 5){
            System.out.println("SEM ÁLCOOL");
        }else{
            System.out.println("----------");
        }   
    }
    
    public void fornecedorNome(){
        if(fornecedor == 0){
            System.out.println("AMBEV");
        }else if (fornecedor == 1){
        System.out.println("FEMSA");
        }else{
            System.out.println("OUTROS");
    }
    
    }
    
}
