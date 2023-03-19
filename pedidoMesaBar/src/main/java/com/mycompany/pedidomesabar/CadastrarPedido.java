
package com.mycompany.pedidomesabar;

public class CadastrarPedido {
    
    private String nomeCliente;
    private int mesa;
    private int codItem;
    private int quantItem;
    private double valorUnitario;
    private double valorTotalPedido;
    
    public CadastrarPedido(String nomeCliente, int mesa, int codItem, int quantItem, double valorUnitario) {
        this.nomeCliente = nomeCliente;
        this.mesa = mesa;
        this.codItem = codItem;
        this.quantItem = quantItem;
        this.valorUnitario = valorUnitario;
        
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public void setQuantItem(int quantItem) {
        this.quantItem = quantItem;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }
    

    public void CalcularPedido(){
        this.valorTotalPedido = this.valorUnitario * this.quantItem;
    }
    
}
