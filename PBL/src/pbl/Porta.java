/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl;

/**
 *
 * @author felip
 */
public class Porta {
    private int aberta;
    private String cor;
    private double altura;
    private double largura;
    private double espessura;
    
    public void abrir(){
        this.aberta=1;
    }
    public void fechar(){
        this.aberta=0;
    }
    public void pintarporta(String cor){
        this.cor=cor;
    }
    public boolean checagem(){
        if(this.aberta==1){
            return true;
        }else{
            return false;
        }
    }

    public int getAberta() {
        return aberta;
    }

    public String getCor() {
        return cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getEspessura() {
        return espessura;
    }

    public void setEspessura(double espessura) {
        this.espessura = espessura;
    }
    
}
