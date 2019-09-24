package ejemplojava;
/**
 * @author María Alejandra
 */
public class StringAuxV1  implements IStringAux{
    @Override
    public String quitarEspSobrantes(String texto) {
        // Recorrer caracter a caracter quitando los sobrantes
        String result = "";
        texto = texto.trim();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ') {
                result += texto.charAt(i);
            } else if (i < texto.length() - 1){    // Si es ESP
                if (texto.charAt(i + 1) != ' ') 
                    result += ' ';
            }
        }
        return result;
    }
}
