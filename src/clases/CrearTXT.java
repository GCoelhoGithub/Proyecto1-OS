/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CrearTXT extends Thread {

    int time;
    Comunica comu;
    boolean simulacion;
    int numPC;
    int numPB;
    int numGer;
    int numPPin;
    int numPP;
    float gananciaBruta;

    @Override
    public void run() {
        int y = 0;
        int salarioTotal = 0;
        int salaryGer = 0;
        int salaryPC = 0;
        int salaryPB = 0;
        int salaryPP = 0;
        int salaryPPin = 0;
        int salaryJefe = 0;
        int salaryEns = 0;
        float Telterminados = 0;
        float gananciaNeta;
        int numPantalla;
        int numBotones;
        int numPins = 0;
        float numCamaras = 0;

        while (simulacion = true) {

            salaryGer = numGer * 180 * y;
            salaryPC = numPC * 120 * y;
            salaryPB = numPB * 96 * y;
            salaryPP = numPP * 72 * y;
            salaryPPin = numPPin * 120 * y;
            numPantalla = numPP * 3*y;
            numBotones = numPB * 3*y;
            numPins = numPPin*y;
            numCamaras = numPC / 3*y;
            salaryJefe = 168 * y;
            salaryEns = 144 * y;
            gananciaBruta = this.comu.Telterminados * 1199 * this.comu.lote;
            Telterminados = this.comu.Telterminados;
            salarioTotal = salaryPC + salaryPP + salaryPB + salaryGer + salaryPPin + salaryJefe + salaryEns;
            gananciaNeta = gananciaBruta - salarioTotal;
            y++;
            File archivo;
            FileWriter escribir;
            PrintWriter linea;
            archivo = new File("Datos.txt");
            if (!archivo.exists()) {
                try {
                    archivo.createNewFile();
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);
                    linea.println("Salario Total: " + salarioTotal);
                    linea.println("Ganancia Bruta: " + gananciaBruta);
                    linea.println("Ganancia Neta: " + gananciaNeta);
                    linea.println("Telefonos Terminados: " + this.comu.Telterminados);
                    linea.println("Camaras Producidas: " + numCamaras);
                    linea.println("Pantallas Producidas: " + numPantalla);
                    linea.println("Botones Producidos: " + numBotones);
                    linea.println("Pins Producidos: " + numPins);
                    linea.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n");
                    linea.close();
                    escribir.close();
                } catch (IOException ex) {
                    Logger.getLogger(CrearTXT.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);
                    linea.println("Salario Total: " + salarioTotal);
                    linea.println("Ganancia Bruta: " + gananciaBruta);
                    linea.println("Ganancia Neta: " + gananciaNeta);
                    linea.println("Telefonos Terminados: " + this.comu.Telterminados);
                    linea.println("Camaras Producidas: " + numCamaras);
                    linea.println("Pantallas Producidas: " + numPantalla);
                    linea.println("Botones Producidos: " + numBotones);
                    linea.println("Pins Producidos: " + numPins);
                    linea.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n");
                    linea.close();
                    escribir.close();
                } catch (IOException ex) {
                    Logger.getLogger(CrearTXT.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try{
                CrearTXT.sleep(time*1000);
            }catch(InterruptedException e){
                JOptionPane.showMessageDialog(null, "Error en Hilo CrearTXT");
            }
        }
    }

    public void valores(int time, int numGer, int numPC, int numPB, int numPP, int numPPin, boolean simulacion, Comunica comu) {
        this.comu = comu;
        this.simulacion = simulacion;
        this.numGer = numGer;
        this.numPC = numPC;
        this.numPB = numPB;
        this.numPP = numPP;
        this.numPPin = numPPin;
        this.time = time;
    }
}
