package pkg;

/**
 * @author María Alejandra
 */
public class ProbandoString {
    
    public static void tratarCadena(){
        String texto = "En un lugar de la Mancha de cuyo nombre no quiero acordarme"; 
        String texto2 = "Hola hola"; 
        String texto3 = "En un lugar de la Mancha de cuyo nombre no quiero acordarme"; 
        String texto4 =  "lugar"; 
        System.out.println(texto);
        System.out.println(texto.charAt(3));
        System.out.println(texto.toUpperCase());
        System.out.println(texto.compareTo(texto2));
        System.out.println(texto.compareTo(texto3));
        if (texto.contains(texto4))
            System.out.println("El texto 1 contiene al texto 4");
        System.out.println(texto.indexOf("lugar"));
        texto= texto.replace("lugar", "bar");
        System.out.println(texto);
        System.out.println("Texto sin espacios: " + texto3.replace(" ","")); 
        String texto5= "    en un    lugar";
        //Contar el numero de palabras 
        
        String y; 
        y=texto5.trim(); 
        System.out.println(y);
        int i=contarPalabras(y);
        System.out.println(i);
        
        

        
    
    
        
        
        
}
        public static int contarPalabras(String entrada) {
            //Comprobamos si esta vacia la cadena
            if (entrada == null || entrada.isEmpty()) {
                return 0;
            }
            String[] words = entrada.split("\\s+"); //Array de String separadas por donde hayan espacios
            return words.length;
        }
            
}
