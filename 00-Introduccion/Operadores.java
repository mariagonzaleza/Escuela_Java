class Operadores{
	public static void main(String[] args){
		//Operador ?: 
		System.out.println(5 != 5 ? "Pues si":"Pues no"); 
		if("aa".equals(args[0])){
			System.out.println("Quieres dos AA"); 
		}
		else{
			System.out.println("Quieres otra cosa"); 
		}; 
		System.out.println("aa".equals(args[0]) ? "Quieres dos AA": "Quieres otra cosa");
		byte resultado = 113 & 199; 
		System.out.println("Resultado= " + resultado); 
	};
};