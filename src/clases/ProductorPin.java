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
public class ProductorPin extends Thread {

    Comunica comu;
    int numPPin;
    int time;
    boolean simulacion;
    int almacenPin;

    @Override
    public void run() {

        Semaphore dispPin = new Semaphore(almacenPin + 1);
        int salaryPPin = 0;
        int numPin = 0;

        while (simulacion = true) {
            salaryPPin = salaryPPin + 5 * numPPin * 24;
            numPin = numPin + numPPin;
            almacenPin = almacenPin - numPPin;
            if (almacenPin > 0) {
                System.out.println("Capacidad almacen de Pin: " + almacenPin);
                try {
                    ProductorPin.sleep(time * 1000);
                } catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null, "Error en Hilo ProductorPin");
                }
            } else {
                System.out.println("Capacidad almacen de Pin: " + 1);
                this.comu.setValorPin(numPin);
                this.comu.setValorSalaryPPin(salaryPPin);
                try {
                    ProductorPin.sleep(time * 1000);
                } catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null, "Error en Hilo ProductorPin");
                }
            }
        }

    }

    public void valores(int time, int almacenPin, int numPPin, Comunica comu, boolean simulacion) {
        this.numPPin = numPPin;
        this.time = time;
        this.simulacion = simulacion;
        this.comu = comu;
        this.almacenPin = almacenPin;
    }

}
