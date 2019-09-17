/**
*Clase de Introduccion 
*@autor Maria A G A
*/

class HolaMundo{
		public static void main(String[] args){
			System.out.println("Hola mundo!");
			String nombre = "Maria";
			System.out.println("Hola "+ nombre + "!");
			byte unByte = -128; 
			System.out.println("Byte: " + unByte);
			int numero = 1234567590; 
			System.out.println("Numero: " + numero);
			float decimal= 1.234567591012f;
			System.out.println("Float: " + decimal);
			double decimal2= 1.234567890123456789;
			System.out.println("Double: " + decimal2);
			long largo= 1234567890123456789L; //Trillones
			System.out.println("Entero Largo: " + largo);
			char caracter = 65; 
			System.out.println("caracter: "+ caracter);
			{ //Bloque Instruccion
			char [] text = {'a', 'b', 'c', 'd'}; 
			System.out.println("array texto: "+ text[2]);
			for( int i=0; i<text.length ; i++)
				System.out.println(text[i]); 
			}
		};
	
}; 
/* C:\Program Files\Intel\WiFi\bin\;C:\Program Files\Common Files\Intel\WirelessCommon\;%JAVA_HOME%\bin\ */