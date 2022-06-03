/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sralvaro
 */
public class ProductorPantalla extends Thread {

    Comunica comu;
    int numPP;
    int time;
    boolean simulacion;
    int almacenPantalla;

    @Override
    public void run() {

        Semaphore dispPantalla = new Semaphore(almacenPantalla + 3);
        int salaryPP = 0;
        int numPantallas = 0;

        while (simulacion = true) {
            salaryPP = salaryPP + 3 * numPP * 24;
            numPantallas = numPantallas + 3 * numPP;
            almacenPantalla = almacenPantalla - numPantallas;
            if (almacenPantalla > 0) {
                System.out.println("Capacidad almacen de Pantalla: " + almacenPantalla);
                try {
                    ProductorPantalla.sleep(time * 1000);
                } catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null, "Error en Hilo ProductorPantalla");
                }
            } else {
                System.out.println("Capacidad almacen de Pantalla: " + 1);
                this.comu.dispPantalla(dispPantalla.availablePermits());
                this.comu.setValorPantallas(numPantallas);
                this.comu.setValorSalaryPP(salaryPP);
                try {
                    ProductorPantalla.sleep(time * 1000);
                } catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null, "Error en Hilo ProductorPantalla");
                }
            }
        }
    }

    public void valores(int time, int almacenPantalla, int numPP, Comunica comu, boolean simulacion) {
        this.time = time;
        this.numPP = numPP;
        this.simulacion = simulacion;
        this.comu = comu;
        this.almacenPantalla = almacenPantalla;
    }
}
