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
public class CalcularGanancia extends Thread{
    
    int time;
    int lote;
    int Telterminados;
    Comunica comu;
    boolean simulacion;
    int numPC;
    int numPB;
    int numGer;
    int numPPin;
    int numPP;

    @Override
    public void run(){
        int y = 0;
        int salarioTotal = 0;
        int salaryGer = 0;
        int salaryPC = 0;
        int salaryPB = 0;
        int salaryPP = 0;
        int salaryPPin = 0;
        int salaryJefe = 0;
        int salaryEns = 0;
                
        while(simulacion = true){
            
            salaryGer = numGer*180*y;
            salaryPC = numPC*120*y;
            salaryPB = numPB*96*y;
            salaryPP = numPP*72*y;
            salaryPPin = numPPin*120*y;
            salaryJefe = 168*y;
            salaryEns = 144*y;
                
            salarioTotal = salaryPC + salaryPP + salaryPB + salaryGer + salaryPPin + salaryJefe + salaryEns;
            System.out.println("Salario total: " + salarioTotal + "$");
            y++;
            try{
                CalcularGanancia.sleep(time*1000);
                }catch(InterruptedException e){
                    JOptionPane.showMessageDialog(null, "Error en Hilo Calcular Ganancia");
                }
            }
        }
    
 
    public void valores(int time, int lote, int Telterminados, int numPC, int numPB, int numPP, int numPPin, int numGer, Comunica comu, boolean simulacion){
        this.time = time;
        this.lote = lote;
        this.Telterminados = Telterminados;
        this.comu = comu;
        this.simulacion = simulacion;
        this.numGer = numGer;
        this.numPC = numPC;
        this.numPB = numPB;
        this.numPP = numPP;
        this.numPPin = numPPin;

    }
}
