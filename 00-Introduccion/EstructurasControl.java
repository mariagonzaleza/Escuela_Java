class EstructurasControl{
	
	public static void main (String[] argumentos){
		
		//Bucles: 
		for(int i=0; i<argumentos.length; i++){
			System.out.println("Iteracion" + i);
			System.out.println("Argumentos: " + argumentos[i]); 
		}; 
		
		//While
		int i=0; 
		while(i<argumentos.length){
			System.out.println("Iteracion" + i);
			System.out.println("Arg " + argumentos[i]); 
			i++; 
		}; 
		//Do While
	/* 	do{
			System.out.println("Imprime siempre");
		}while(false);
			 */
		 
		//Condicion if else
		boolean condicion = (5<3) && (20==20); 
		if(condicion){
			System.out.println("Es cierto");
		}
		else if(5==3){
			System.out.println("Condicion rara");
		}
		else{ 
			System.out.println("False"); 
		}; 
		//Switch
		int caso =1; 
		switch (caso){
			case 0: 
				System.out.println("Case 0");
				break; 
			case 1: 
				System.out.println("Case 1"); 
				break; 
			default: 
				System.out.println("Otro case"); 
				break; 
		}; 
		
		
				
	}
	
}