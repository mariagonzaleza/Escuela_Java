package Threads;

import ejemplojava.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author María Alejandra
 */
public class HiloFichero {
//   
    IStringAux straux;
    String rutaFich;
    
    //Constructor 
    public HiloFichero(String rutaFich, IStringAux versionFunc){
    straux = versionFunc; 
    this.rutaFich = rutaFich; 
    }
    
    
    
    public  void crearFicheroEjem(){
        String[] palabras = new String['Z' -'A'+1];
        //Para poder hacer un buen testing es mejor generar datos aleatorios.
        Random r = new Random(new Date().getTime()); 
        for (char c= 'A'; c < 'Z'+1; c++){
            //Numero aleatorio entre 2 y 9 ya que r.nextInt() %8 va de 0 a 7 +2 = 9
            int repe = 2 + Math.abs(r.nextInt() % 8); 
            palabras[c - 'A']= "";
            for (int i =0; i<repe; i++){
                palabras [c - 'A'] += "" +c; 
            
            }
        }
                    System.out.println("" + Arrays.toString(palabras));

    //Crear Ficheros
    FileWriter fich = null; 
    try{
    fich= new FileWriter(rutaFich, false); //Con false sobreescribimos contenido  
    for (int i=0; i<200000; i++){
        //Nº aleatorio entre 0 y 2. 
        //1 de cada 3 veces palabra aleatoria
        if(r.nextInt(2)==0)
            fich.write(palabras[r.nextInt(palabras.length)]);
        //1 de cada 2 veces meto espacios
        if(r.nextInt(2)==0)
            for (int j=0; j<10; j++){
                fich.write(" ");
            }
        //1 de cada 12 linea
        if (r.nextInt(12)==0)
            fich.write("\n\r");
        
    }
    }catch (IOException ex){
            System.out.println("Error en escritura : " + ex.getMessage());
    }catch(Exception ex){ //Con este catch recogemos todas las excepciones. 
        //Otro tipo de excepciones como IOException tienen que ponerse antes o no compila
            System.out.println("Otro error: " + ex.getMessage());
    }finally{
            try { 
                if(fich!=null)
                    fich.close();
            } catch (IOException ex) {
                Logger.getLogger(HiloFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    
    
    }
   
    public  void leerFicheroEjem(){
        File fich = new File(rutaFich); 
        Scanner escaner = null;
        
        try{
            escaner = new Scanner(fich); 
            while(escaner.hasNextLine()){
                String linea = escaner.nextLine(); 
                System.out.println(linea);
                System.out.println("Línea Sin Espacios : " + straux.quitarEspSobrantes(linea));
            }
        }catch(Exception ex){ //Con este catch recogemos todas las excepciones. 
        //Otro tipo de excepciones como IOException tienen que ponerse antes o no compila
            System.err.println("Otro error: " + ex.getMessage());
        }finally{
            try { 
                if(escaner!=null)
                    escaner.close();
            } catch (Exception ex) {
                Logger.getLogger(HiloFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
