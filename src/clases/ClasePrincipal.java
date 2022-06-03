
package clases;

import javax.swing.JOptionPane;
import java.io.*;

public class ClasePrincipal{
        
    public static void main(String[] args){

            
    }
    
    public void imprimir(int time, int numPC, int numPPin, int numPB, int numPP, int numGer, int numEns, int countdown, int almacenPantalla, int almacenBotones, int almacenPin, int almacenCamaras, int lote, int Telterminados, boolean simulacion, Comunica comu){
        
            
            ProductorPantalla hilo1 = new ProductorPantalla();
            ProductorBotones hilo2 = new ProductorBotones();
            ProductorCamara hilo3 = new ProductorCamara();
            ProductorPin hilo4 = new ProductorPin();
            Ensamblador hilo5 = new Ensamblador();
            Ensamblaje hilo7 = new Ensamblaje();
            Gerente hilo8 = new Gerente();
            Countdown hilo9 = new Countdown();
            Imprimir hilo11 = new Imprimir();
            CalcularGanancia hilo10 = new CalcularGanancia();
            CrearTXT hilo12 = new CrearTXT();
            
            hilo1.valores(time, almacenPantalla, numPP, comu, simulacion);
            hilo1.start();

            hilo2.valores(time, almacenBotones, numPB, numGer, comu, simulacion);
            hilo2.start();

            hilo3.valores(time, almacenCamaras, numPC, comu, simulacion);
            hilo3.start();

            hilo4.valores(time, almacenPin, numPPin, comu, simulacion);
            hilo4.start();

            hilo5.valores(time, comu, simulacion);
            hilo5.start();

            hilo7.valores(time, comu, simulacion);
            hilo7.start();

            hilo8.valores(time, comu, simulacion);
            hilo8.start();

            hilo9.valores(time, countdown, comu, simulacion);
            hilo9.start();
            
            hilo11.valores(time, numPC, numPPin, numPB, numPP, numGer, numEns, countdown, almacenPantalla, almacenBotones, almacenPin, almacenCamaras, simulacion,  comu);
            hilo11.start();
            
            hilo10.valores(time, lote, Telterminados, numPC, numPB, numPP, numPPin, numGer, comu, simulacion);
            hilo10.start();
            
            hilo12.valores(time, numGer, numPC, numPB, numPP, numPPin, simulacion, comu);
            hilo12.start();
        
    }
    
    public void leerTXT(String direccion){
        
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            
            while((bfRead = bf.readLine())!= null){
                temp = temp + bfRead;
                texto = temp;
            }
        }catch(Exception e){System.err.println("No se encontro archivo");}
    }

}
     
