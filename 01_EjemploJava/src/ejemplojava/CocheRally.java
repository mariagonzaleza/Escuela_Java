package ejemplojava;
/**
 * @author María Alejandra
 */

public class CocheRally extends Coche {
    private float rozamiento; 
    
    public CocheRally(String marca, TipoCarburante carburante, TipoColor color, float roz){
        super(marca, carburante, color); 
        this.rozamiento= roz;
    }
    
    public CocheRally(String marca, TipoCarburante carburante, String color, float roz){
        super(marca, carburante, color); 
        this.rozamiento= roz;
    }
    
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
