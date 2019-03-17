/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class Casa {
    private String cor;
    private ArrayList<Porta> portas;
    
    public Casa(){
        this.portas= new ArrayList();
    }
    
    public void pintarcasa(String cor){
        this.setCor(cor);
    }
    public int checagemtotal(){
        int i,x=0;
        for(i=0;i<getPortas().size();i++){
            if(getPortas().get(i).getAberta()==1){
                x++;
            }
        }
        return x;
    }
    public int totalportas(){
        return getPortas().size();
    }
    public void cadastroporta(Porta porta){
        this.portas.add(porta);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public ArrayList<Porta> getPortas() {
        return portas;
    }
    public void setPortas(ArrayList<Porta> portas) {
        this.portas = portas;
    }
    
    
}
