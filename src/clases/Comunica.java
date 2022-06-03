/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author sralvaro
 */
public class Comunica {

    int numPin;
    public int numPantallas;
    float numBotones;
    float numCamaras;
    float Telterminados;
    int salaryEns;
    int salaryPC;
    int salaryPB;
    int salaryPP;
    int salaryPPin;
    int salaryGer;
    int salaryJefe;
    int fallas = 0;
    int lote = 0;
    int gananciaBruta;
    int salarioTotal;
    int gananciaNeta;
    boolean CheckJefe;
    boolean StatusGerente;
    int dispBoton;
    int dispCamara;
    int dispPantalla;
    int dispPin;
    
    public void setValorPin(int numPin){
        this.numPin = numPin; 
    }
    
    public int getValorPin(){
        return (numPin);
    }
    
    public void setValorPantallas(int numPantallas){
        this.numPantallas = numPantallas; 
    }
    
    public int getValorPantallas(){
        return (numPantallas);
    }
    
    public void setValorBotones(int numBotones){
        this.numBotones = numBotones; 
    }
 
    public void setValorCamaras(float numCamaras){
        this.numCamaras = numCamaras; 
    }
    
    public void setValorTelterminados(float min){
        this.Telterminados = min;
    }
    
    public void setSalaryEns(int salaryEns){
        this.salaryEns = salaryEns;
    }
    
    public void setValorSalaryPC(int salaryPC){
        this.salaryPC = salaryPC;
    }
    
    public void setValorSalaryPB(int salaryPB){
        this.salaryPB = salaryPB;
    }
    
    public void setValorSalaryPP(int salaryPP){
        this.salaryPP = salaryPP;
    }
    
    public void setValorSalaryPPin(int salaryPPin){
        this.salaryPPin = salaryPPin;
    }
    
    public void setValorSalaryGer(int salaryGer){
        this.salaryGer = salaryGer;
    }
    
    public void setValorSalaryJefe(int salaryJefe){
        this.salaryJefe = salaryJefe;
    }
    public void setStatusGerente(boolean CheckJefe){
        this.StatusGerente = CheckJefe;
    }
    
    public void setLote(int lote){
        this.lote = lote;
    }
    
    public void setgananciaNeta(int gananciaNeta){
        this.gananciaNeta = gananciaNeta;
    }
    
    public void dispPin(int dispPin){
        this.dispPin = dispPin;
    }
    
    public void dispPantalla(int dispPantalla){
        this.dispPantalla = dispPantalla;
    }
    
    public void dispBoton(int dispBoton){
        this.dispBoton = dispBoton;
    }
    
    public void dispCamara(int dispCamara){
        this.dispCamara = dispCamara;
    }

}
