/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author sralvaro
 */
public class Countdown extends Thread{
    
    int time;
    int countdown;
    Comunica comu;
    boolean simulacion;
    
    @Override
    public void run(){
        
        int lote = -1;
        
        while(simulacion = true){

            lote++;
            this.comu.setLote(lote);
            try{
                ProductorBotones.sleep(time*1000*countdown);
            }catch(InterruptedException e){
                JOptionPane.showMessageDialog(null, "Error en Hilo ProductorBotones");
            }
        }   
    }
    
    public void valores(int time, int countdown, Comunica comu, boolean simulacion){
        this.time = time;
        this.countdown = countdown;
        this.comu = comu;
        this.simulacion = simulacion;
    }
}  

            
        
 

