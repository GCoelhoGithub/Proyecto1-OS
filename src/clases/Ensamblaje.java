/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;
import java.lang.Math;

/**
 *
 * @author sralvaro
 */
public class Ensamblaje extends Thread{
    
    int time;
    Comunica comu;
    boolean simulacion;

    
    @Override
    public void run (){
        
        while(simulacion = true){
            int telPorPin = this.comu.numPin;
            int telPorPantallas = this.comu.numPantallas;
            float telPorBotones = this.comu.numBotones/3;
            float telPorCamaras = this.comu.numCamaras/4;
            float min1 = Math.min(telPorPin,telPorPantallas); 
            float min2 = Math.min(telPorBotones, telPorCamaras);
            float min = Math.min(min1, min2);
            this.comu.setValorTelterminados(min);
                try{
                    Ensamblaje.sleep(time*2000);
               }catch(InterruptedException e){
                   JOptionPane.showMessageDialog(null, "Error en Hilo Ensamblaje");
                }
        }
    }
    
    public void valores (int time, Comunica comu, boolean simulacion){
        this.time = time;
        this.comu = comu;
        this.simulacion = simulacion;
    }
}
