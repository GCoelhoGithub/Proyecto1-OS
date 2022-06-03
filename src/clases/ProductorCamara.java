
package clases;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductorCamara extends Thread{
    
    int time;
    int numPC;
    boolean simulacion;
    Comunica comu;
    int almacenCamaras;
    
    @Override
    public void run(){
        
        Semaphore dispCamara = new Semaphore(almacenCamaras+4);
        int salaryPC = 0;
        float numCamaras = 0;

        while(simulacion = true){
            salaryPC = salaryPC + 5*numPC*24;
            numCamaras = numCamaras + numPC/3;
            almacenCamaras = almacenCamaras - (int)numCamaras;
            if(almacenCamaras > 0){
            System.out.println("Capacidad almacen de Camaras: " + almacenCamaras);
            try{
                ProductorCamara.sleep(time*1000);
            }catch(InterruptedException e){
                JOptionPane.showMessageDialog(null, "Error en Hilo ProductorCamara");
            }}
            else{
                System.out.println("Capacidad almacen de Camaras: " + 4);
            }
            try {
                dispCamara.acquire((int) numCamaras);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorCamara.class.getName()).log(Level.SEVERE, null, ex);
            }
             this.comu.dispCamara(dispCamara.availablePermits());
            this.comu.setValorCamaras(numCamaras/3);
            this.comu.setValorSalaryPC(salaryPC); 
            try{
                ProductorCamara.sleep(time*1000);
            }catch(InterruptedException e){
                JOptionPane.showMessageDialog(null, "Error en Hilo ProductorCamara");
            }
        }
    }
    
    public void valores(int time, int almacenCamaras, int numPC, Comunica comu, boolean simulacion){
        this.time = time;
        this.numPC = numPC;
        this.simulacion = simulacion;
        this.comu = comu;
        this.almacenCamaras = almacenCamaras;
    }
}
