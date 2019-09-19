package ejemplojava;
/**
 * @author María Alejandra
 */

public class CocheRally extends Coche {
    private float rozamiento; 
        public CocheRally(String matricula, byte ruedas, String marca, int litros_deposito, float nivel_deposito, boolean arrancado, TipoColor colores, TipoCarburante carburante){
        super(matricula,marca, litros_deposito, nivel_deposito,  arrancado,colores, carburante); 
        this.rozamiento= 2.0f;
    }
    
      @Override
    public void abrirPuerta() {
        System.out.println("¡Abriendo Puertas del coche RALLY!");
    }
        
    
//    public CocheRally(String matricula, String marca, int litros_deposito, float nivel_deposito, boolean arrancado, Coche.TipoCarburante combustible, Coche.TipoColor color){
//        super(matricula, (byte) 2, marca, litros_deposito,nivel_deposito, arrancado,color, combustible); 
//        this.rozamiento= roz;
//    }
//    
//    public CocheRally(String marca, TipoCarburante carburante, String color, float roz){
//        super(marca, carburante, color); 
//        this.rozamiento= roz;
//    }
    
    public float getRozamiento() {
        return rozamiento;
    }

    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }
    
    public void derrapar(){
        System.out.println("Derrapando!");
        explosionCilindro();
    }
    //Sobreescritura de datos debe coincidir todo menos los parámetros del método
    public void derrapar(float cuanto){
        System.out.println("Derrapando!" + cuanto);
        explosionCilindro();
    }
    
    
    
}
