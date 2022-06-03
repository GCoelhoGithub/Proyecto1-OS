/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author sralvaro
 */
public class Gerente extends Thread{
    
    Comunica comu;
    int time;
    boolean simulacion;
    @Override
    public void run(){
        
        int salaryJefe = 0;
        int c = 0;
        int fallos = 0;

        while(simulacion = true){
            Random random = new Random();
            boolean statusJefe = random.nextBoolean();
            boolean statusGerente = random.nextBoolean();
            salaryJefe = salaryJefe + 7*24*c;
            if(statusJefe == true && statusGerente == true){
                salaryJefe = salaryJefe-2;
                fallos++;
            }
            System.out.println("Salario Jefe: " + salaryJefe +"$");
            System.out.println("Jefe Jugando: " + statusJefe);
            System.out.println("Gerente Revisando:" + statusGerente);
            System.out.println("Jefe Atrapado: " + fallos);
            c++;
                try{
                    Gerente.sleep(time*1000);
                }catch(InterruptedException e){
                    JOptionPane.showMessageDialog(null, "Error en Hilo Gerente");
                }
        
            }
    }
    public void valores(int time, Comunica comu, boolean simulacion){
        this.time = time;
        this.comu = comu;
        this.simulacion = simulacion;
        }    
}

