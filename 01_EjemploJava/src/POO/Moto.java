package POO;

import ejemplojava.Coche;

/**
 * @author María Alejandra
 */
public class Moto extends Vehiculo implements Rodable {

    public Moto(String matricula,String marca, int litros_deposito, float nivel_deposito, boolean arrancado) {
        super(matricula, (byte)2, marca, litros_deposito, nivel_deposito, arrancado);
    }

    @Override
    public void abrirPuerta() {
        System.out.println("Loco,no hay puertas!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public byte getNumruedas() {
        return this.ruedas; 
    }

    @Override
    public void moverse() {
        acelerar(); 
    }


}
