package POO;

import ejemplojava.Coche;

/** Cuando tenemos una entidad de la que no podemos crear un objeto se dice que es abstracto
 * Es decir; vehiculo puede ser un coche, moto, camion, bus...
 * @author María Alejandra
 */
public abstract class Vehiculo {
    
    private String matricula;
    protected final byte ruedas; //Como hemos definido en nuestro coche las ruedas como 4 es constate
    protected final String marca; 
    protected final int litros_deposito; //Capacidad
    protected float nivel_deposito; //Nivel de combustible
    boolean arrancado; 

    
    public Vehiculo(String matricula, byte ruedas, String marca, int litros_deposito, float nivel_deposito, boolean arrancado){
        this.matricula=matricula; 
        this.ruedas=ruedas; 
        this.marca=marca; 
        this.nivel_deposito = nivel_deposito; 
        this.litros_deposito=litros_deposito;  
        this.arrancado = arrancado; 
    }
    
    

    public String getMatricula() {
        return this.matricula;
        
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public abstract void abrirPuerta();
    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    public void acelerar(){
        if(arrancado){
            nivel_deposito -=0.1f; 
            
            
    }
    }
    

}
