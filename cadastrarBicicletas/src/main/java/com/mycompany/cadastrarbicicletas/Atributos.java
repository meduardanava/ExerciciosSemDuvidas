
package com.mycompany.cadastrarbicicletas;

public class Atributos {
    
    public String modelo;
    public String marca;
    public int aro;
    private String cor;
    private int marcha;
    private double valorCusto;
    private double valorVenda;     

    public Atributos(String modelo, String marca, int aro, String cor, int marcha, double valorCusto, double valorVenda) {
        this.modelo = modelo;
        this.marca = marca;
        this.aro = aro;
        this.cor = cor;
        this.marcha = marcha;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    public void aroNum(){
        switch (aro) {
            case 0:
                System.out.println("12");
                break;
            case 1:
                System.out.println("16");
                break;
            case 2:
                System.out.println("20");
                break;
            case 3:
                System.out.println("24");
                break;
            case 4:
                System.out.println("26");
                break;
            case 5:
                System.out.println("27,5");
                break;
            case 6:
                System.out.println("29");
                break;
            case 7:
                System.out.println("700");
                break;
            default:
                System.out.println("-------");
                break;
        }
    }
        
    public void quantMarcha(){
        switch (marcha) {
            case 0:
                System.out.println("18");
                break;
            case 1:
                System.out.println("21");
                break;
            case 2:
                System.out.println("24");
                break;
            case 3:
                System.out.println("27");
                break;
            case 4:
                System.out.println("30");
                break;
            default:
                break;
        }
    }             
        
}

    



