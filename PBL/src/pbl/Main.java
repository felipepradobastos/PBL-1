/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl;

import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Teste PORTA
        Porta teste = new Porta();
        teste.abrir();
        if(teste.checagem()==true){
            System.out.println("A porta esta Aberta!");
        }else{
            System.out.println("A porta esta Fechada! ");
        }
        teste.pintarporta("Vermelho");
        teste.fechar();
        if(teste.checagem()==true){
            System.out.println("A porta esta Aberta!");
        }else{
            System.out.println("A porta esta Fechada! ");
        }
        teste.pintarporta("Azul");
        teste.setAltura(1);
        teste.setLargura(1.1);
        teste.setEspessura(0.2);
        
        // TESTE CASA
        Casa home = new Casa();
        home.pintarcasa("Verde");
        Porta portascasa;
        //int x=JOptionPane.showConfirmDialog(null, "Adicionar uma Casa?");
        //System.out.println(x);
        int x=10;
        while(x!=1){
           x=JOptionPane.showConfirmDialog(null, "Adicionar uma porta?");
           if(x==0){
               portascasa = new Porta();
               home.cadastroporta(portascasa);
           }
        }
        int i;
        //Fran temos um problema aqui 0 não e par nem impar so pra deixar claro eu pensei
        //em tipo considerar o 0 como 1 e abrir mas enfim vai dar trabalho.
        for(i=0;i<home.getPortas().size();i++){
            if(i%2==0){
                home.getPortas().get(i).fechar();
            }else{
                home.getPortas().get(i).abrir();
            }
        }
        System.out.println("Este e o Total de Portas Abertas:"+home.checagemtotal());
        //Teste Edificio
        Edificio bd = new Edificio();
        Andar andarbd;
        Porta portabd;
        bd.pintaredificio("Azul");
        for(i=0;i<=5;i++){
            portabd = new Porta();
            bd.cadastroporta(portabd);
        }
        for(i=0;i<bd.getPortasedi().size();i++){
            if(i%2==0){
                bd.getPortasedi().get(i).fechar();
            }else{
                bd.getPortasedi().get(i).abrir();
            }
        }   
        System.out.println("O numero de portas abertas no Edificio:"+bd.portasabertas());
        System.out.println("O numero de portas no edificio é de:"+bd.totalportas());
        for(i=0;i<=3;i++){
            andarbd = new Andar();
            bd.cadatroandar(andarbd);
        }   
        System.out.println("O numero de Andares é de:"+bd.totalandares());
    }
    
}
