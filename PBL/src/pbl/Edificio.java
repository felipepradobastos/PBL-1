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
public class Edificio {
    private String cor;
    //private String[] andares[];
    private int quantportas;
    private ArrayList<Porta> portasedi;
    private ArrayList<Andar> andaredi;
    
    public Edificio(){
        this.portasedi=new ArrayList();
        this.andaredi=new ArrayList();
    }
    
    public void pintaredificio(String cor){
        this.cor=cor;
    }
    public int portasabertas(){
        int i,x=0;
        for(i=0;i<getPortasedi().size();i++){
            if(getPortasedi().get(i).getAberta()==1){
                x++;
            }
        }
        return x;
    }
    public void cadastroporta(Porta porta){
        this.portasedi.add(porta);
    }
    public void cadatroandar(Andar andar){
        this.andaredi.add(andar);
    }
    public int totalportas(){
        return portasedi.size();
    }
    public int totalandares(){
        return andaredi.size();
    }
    //public int totalandares(){
    //    return this.andares.length;
    //}
    //public void addandar(){
    //   this.andares
    //}

    public String getCor() {
        return cor;
    }

    public ArrayList<Porta> getPortasedi() {
        return portasedi;
    }

    public void setPortasedi(ArrayList<Porta> portasedi) {
        this.portasedi = portasedi;
    }

    public ArrayList<Andar> getAndaredi() {
        return andaredi;
    }

    public void setAndaredi(ArrayList<Andar> andaredi) {
        this.andaredi = andaredi;
    }
}
