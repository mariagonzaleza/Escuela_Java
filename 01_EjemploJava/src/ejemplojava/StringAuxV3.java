package ejemplojava;
/**
 * @author María Alejandra
 */
public class StringAuxV3 implements IStringAux{
@Override 
    public  String  quitarEspSobrantes(String texto) {
        texto = texto.trim();
        
        while (texto.contains("  ")) {
            texto = texto.replace("  ", " ");
        }
        return texto;
    }
}
