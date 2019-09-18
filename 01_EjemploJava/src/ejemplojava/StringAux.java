package ejemplojava;

/**
 * @author Danny
 */

public final class StringAux {
	
		String str;
		
		public StringAux(String str){
			this.str =str;
		}
		
		public String quitarEspacios(){
			
			this.str = this.str.toUpperCase().trim();

			//String[] auxT = this.str.split(" ");
			String textoCorregido ="";
			String[] aux2 = this.str.split("\\s+");
			for (String aux1 : aux2) {
				textoCorregido = textoCorregido.concat(aux1 + " ");			
			}
                        this.str = this.str.trim();
			this.str = textoCorregido;
			return this.str;
                        
			
		}
		/* for( i=0, i<texto.length(); i++){
                        if( texto.charAt(i)!=' '){
                            result += texto.charAt(i);
                        }
                else if (i<texto.length()-1){
                        if{texto.charAt(i+1)!= ' '){
                            result+=' '; 
                        }
                        }  
                return result; 
                }
                */
		public int contarPalabras(){
			//String[] auxT = this.str.split(" ");
			//int contador = 0;
			
			String[] aux2 = this.str.split("\\s+");
			//for (String aux1 : aux2) {
				//if (!aux1.isEmpty()) {
					//contador++;
				//}
			//}
			return aux2.length;
		}

            public String getStr() {
                return str;
            }

            public void setStr(String str) {
                this.str = str;
            }
            
    
                
               

                

}
