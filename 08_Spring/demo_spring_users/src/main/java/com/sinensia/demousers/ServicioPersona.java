package com.sinensia.demousers;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** Singleton porque solo queremos un servicio por aplicacion/servidor
 * 
 * @author Raul 
 */

@RestController
@RequestMapping("/personas")
public class ServicioPersona {

    private ArrayList<Persona> personas;
    
    @RequestMapping(method = RequestMethod.POST)
    public Persona addPersonas(
    		@RequestParam(value="nombre")String nombre,
    		@RequestParam(value="edad", defaultValue="1")String edad)
            throws NumberFormatException, IOException, IllegalArgumentException{
            
            if(nombre.equals("")){
                throw new IllegalArgumentException("El nombre esta vacio");
            }else if(nombre.length() < 2){
                throw new IllegalArgumentException("El nombre es demasiado corto");
            }else if(edad.equals("")){
                throw new NumberFormatException("La edad esta vacia");
            }else{
                int intEdad = Integer.parseInt(edad);
                if (intEdad <= 12) {
                    throw new IllegalArgumentException("La edad debe ser mayor que 12");
                }else{
                    Persona p = new Persona(nombre, intEdad);
                    personas.add(p);
                    return p;
                }
            }
          }
     @RequestMapping(method = RequestMethod.GET)
     public ArrayList<Persona> getPersona(String nombre){
    	if(personas == null) {
    		personas = new ArrayList<Persona>();
    		personas.add(new Persona("Pepe", 20));
    		personas.add(new Persona("juan", 30));
    		personas.add(new Persona("jacinto", 40));
    	}
        return this.personas;
    }
     
     @RequestMapping(method = RequestMethod.PUT)
     public void updatePersona(String nombre, int edadNueva){
    	 for(Persona p: personas) {
    		 if(p.getNombre().equals(nombre)) {
    			 p.setEdad(edadNueva);
    			
    	 }
     }
     }
     
     @RequestMapping(method = RequestMethod.DELETE)
     public void deletePersona(String nombre){
    	 for(Persona p: personas) {
    		 if(p.getNombre().equals(nombre)) {
    			 personas.remove(personas.indexOf(p)); 
    		 }
    		 
    	 }		
     }
     
     @RequestMapping(method = RequestMethod.GET)
     public Persona getPersonaByName(String nombre){
    	 Persona personaByName=null; 
    	 for(Persona p: personas) {
    		 if(p.getNombre().equals(nombre)) {
    			 personaByName=p;
    			
    	 }
    		 
     }
    	 return personaByName; 
    	 
     }
     
     
}