
package clases;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import clases.ClasePrincipal;

public class ProductorBotones extends Thread{
    
    int numPB;
    int time;
    boolean simulacion;
    int numGer;
    Comunica comu;
    int almacenBotones;
    
    @Override
    public void run(){

        Semaphore dispBotones = new Semaphore(almacenBotones+9);
        int salaryPB = 0;
        int numBotones = 0;
        int salaryGer = 0;

        while(simulacion = true){
            salaryPB = salaryPB + 4*numPB*24;
            numBotones = numBotones + 3*numPB;
            almacenBotones = almacenBotones-numBotones;
            if(almacenBotones > 0){
            System.out.println("Capacidad almacen de Botones: " + almacenBotones);
            try{
                ProductorBotones.sleep(time*1000);
            }catch(InterruptedException e){
                JOptionPane.showMessageDialog(null, "Error en Hilo ProductorBotones");
            }
            }else{
                System.out.println("Capacidad almacen de Botones: " + 3);
            }
            try {
                dispBotones.acquire(numBotones);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorBotones.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.comu.dispBoton(dispBotones.availablePermits());
            salaryGer = salaryGer + numGer*180;
            this.comu.setValorBotones(numBotones);
            this.comu.setValorSalaryPB(salaryPB);
            this.comu.setValorSalaryGer(salaryGer);
            try{
                ProductorBotones.sleep(time*1000);
            }catch(InterruptedException e){
                JOptionPane.showMessageDialog(null, "Error en Hilo ProductorBotones");
            }
        }
    }
    
    public void valores(int time, int almacenBotones, int numPB, int numGer, Comunica comu, boolean simulacion){
        this.time = time;
        this.numPB = numPB;
        this.simulacion = simulacion;
        this.comu = comu;
        this.numGer = numGer;
        this.almacenBotones = almacenBotones;
    }
}
