package ejemplojava;
/**
 * @author María Alejandra
 */
public class Coche {
    
    enum TipoColor{
        BLANCO, NEGRO, ROJO, VERDE, AZUL, PLATEADO
    }; //Blanco sería el elemento nº 0, negro el nº 1... etc 
    //Tipo color sería equivalente a un int 
    
    enum TipoCarburante{
        GASOLINA, DIESEL
    };
    
    private final byte ruedas; //Como hemos definido en nuestro coche las ruedas como 4 es constate
    private final String marca; 
    public final int litros_deposito; //Capacidad
    private float nivel_deposito; //Nivel de combustible
    boolean arrancado; 
    private TipoColor colores; //Colores disponibles para los coches.
    private final TipoCarburante carburante; //Gasolina o Diesel 

    
    /*public Coche(){
       
    }*/
    
    public Coche(String marca, TipoCarburante carburante, TipoColor color){
        ruedas=4; 
        this.marca=marca; 
        this.carburante=carburante; 
        litros_deposito=80;
        colores= color;    
    }
    //CONSTRUCTOR PARA RECIBIR UN COLOR EN FORMA DE STRING EN VEZ DE PASARLO POR TIPOCOLOR
     public Coche(String marca, TipoCarburante carburante, String color){
        ruedas=4; 
        this.marca=marca; 
        this.carburante=carburante; 
        litros_deposito=80;
       
       /* if (TipoColor.valueOf(color) == TipoColor.ROJO)
            this.colores=TipoColor.ROJO; 
        else if (TipoColor.valueOf(color) == TipoColor.BLANCO)
            this.colores=TipoColor.BLANCO;
        else if (TipoColor.valueOf(color) == TipoColor.NEGRO)
            this.colores=TipoColor.NEGRO;
        else if (TipoColor.valueOf(color) == TipoColor.VERDE)
            this.colores=TipoColor.VERDE;
        else if (TipoColor.valueOf(color) == TipoColor.AZUL)
            this.colores=TipoColor.AZUL;
        else if (TipoColor.valueOf(color) == TipoColor.PLATEADO)
            this.colores=TipoColor.PLATEADO;*/ //Forma 1 de hacerlo 
        //switch(color)
        //case "ROJO" : this.colores=TipoColor.ROJO....2º FORMA 
        this.colores=TipoColor.valueOf(color); //3º PARSE 
        
                
    }
    
    public void vaciarDeposito (Coche c){
        this.nivel_deposito= 3; 
        System.out.println("Deposito vaciado de: " + c.marca + "\n Nivel: " + c.nivel_deposito );
    }; 
    @Override
    public String toString(){
        return "Marca de Coche: " + marca + "Color: "+ this.colores.toString() + "Nivel Depósito actual: " + nivel_deposito;
    }
    
    public void acelerar(){
    if(arrancado){
        nivel_deposito -=0.1f; 
        explosionCilindro(); 
    }
    }
    
    public void mostrarEstado(){
        System.out.println("Marca de Coche: " + marca + "Nivel Depósito actual: " +nivel_deposito);
    }
    public float getNivelGasolina(){
        return nivel_deposito; 
    }
    public void setNivel( float nivel_deposito){
        if(this.nivel_deposito>0)
            this.nivel_deposito+=nivel_deposito;
        if(nivel_deposito>litros_deposito)
            this.nivel_deposito=litros_deposito; 
        
    }

    public String getMarca() {
        return this.marca;
    }
 
    public int getLitros_deposito() {
        return litros_deposito;
    }

    public TipoCarburante getCarburante() {
        return carburante;
    }

    public TipoColor getColores() {
        return colores;
    }

    public void setColores(TipoColor colores) {
        this.colores = colores;
    }
    
    public byte getRuedas() {
        return ruedas;
    }
    
    protected void explosionCilindro(){
        System.out.println("Motor Funcionando\n");
    }
    
    protected void setNivDeposito(float nuevo_niv){
        this.nivel_deposito=nuevo_niv; 
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    
    

}
    

