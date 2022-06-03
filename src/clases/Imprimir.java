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
public class Imprimir extends Thread{
    
    Comunica comu;
    int time;
    boolean simulacion;
    int numPC;
    int numPPin;
    int numPB;
    int numPP;
    int numGer;
    int countdown;
    int almacenPantalla;
    int almacenPin;
    int almacenBotones;
    int almacenCamaras;
    int numEns;

    @Override
    public void run(){
        
        while(simulacion = true){
            System.out.println("Productores de Pantallas: " + numPP + "\n" + "Productores de Pin: " + numPPin + "\n" + "Productores de Botones: " + numPB + "\n" + "Productores de Camaras: " + numPC + "\n" + "Gerentes: " + numGer + "\n" + "Ensambladores: " + numEns + "\n" + "Lote actual: " + this.comu.lote + "\n" + "Ganancia bruta: " + this.comu.Telterminados*1199*this.comu.lote +"$" + "\n" + "\n"+ "\n");
        try{
                Imprimir.sleep(time*1000);
            }catch(InterruptedException e){
                JOptionPane.showMessageDialog(null, "Error en Hilo Imprimir");
            }  }
        
    }
    
    public void valores(int time, int numPC, int numPPin, int numPB, int numPP, int numGer,int numEns, int countdown, int almacenPantalla, int almacenBotones, int almacenPin, int almacenCamaras, boolean simulacion,  Comunica comu){
        this.time = time;
        this.comu = comu;
        this.simulacion = simulacion;
        this.numPC = numPC;
        this.numPPin = numPPin;
        this.numPB = numPB;
        this.numPP = numPP;
        this.numGer = numGer;
        this.numEns = numEns;
        this.countdown = countdown;
        this.almacenPantalla = almacenPantalla;
        this.almacenPin = almacenPin;
        this.almacenBotones = almacenBotones;
        this.almacenCamaras = almacenCamaras;
    }
}
