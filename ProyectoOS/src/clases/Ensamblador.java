package clases;

import javax.swing.JOptionPane;

public class Ensamblador extends Thread{
    
    Comunica comu;
    boolean simulacion;
    int time;
    int numPin;
    int numPantallas;
    int numBotones;
    int numCamaras;
  
    @Override
    public void run(){
        int salaryEns = 0;
        int telTerminados = 0;

        while(simulacion = true){
            
            salaryEns = salaryEns + 6*24;
            this.comu.setSalaryEns(salaryEns);
            try{
                Ensamblador.sleep(time*1000);
            }catch(InterruptedException e){
                JOptionPane.showMessageDialog(null, "Error en Hilo Ensamblador");
            }
        }
        
    }
    
    public void valores(int time, Comunica comu, boolean simulacion){
        this.time = time;
        this.simulacion = simulacion;
        this.comu = comu;
    }
}
        
