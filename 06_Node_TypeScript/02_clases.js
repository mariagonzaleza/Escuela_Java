var Animal = /** @class */ (function () {
    function Animal(especie, edad, volador) {
        this.edad = edad;
        this.especie = especie;
        this.volador = volador;
    }
    Animal.prototype.stringfy = function () {
        return "Animal" + this.especie + "con" + this.edad + this.volador;
    };
    ;
    Animal.prototype.mostrar = function () {
        console.log(this.stringfy);
    };
    ;
    return Animal;
}());
;
var perro = new Animal("Perro", 3, false);
perro.mostrar();
