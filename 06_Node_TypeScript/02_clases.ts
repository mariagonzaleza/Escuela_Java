class Animal{
    especie : String; 
    edad : number;
    volador : boolean; 

    constructor(especie : String, edad : number, volador: boolean){
        this.edad = edad; 
        this.especie= especie; 
        this.volador = volador; 
    }

    stringfy() : string {

        return "Animal" +this.especie + "con" + this.edad +this.volador; 
    };

    mostrar() : void {
            console.log(this.stringfy); 

    }; 
   
};


let perro : Animal = new Animal("Perro", 3, false); 
perro.mostrar();