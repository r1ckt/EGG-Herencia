/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. 
*/
package ejercicio_01;

public class Main {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Sultan", "Sabrositos", 1, "Pichichu");
        Animal perro2 = new Perro("Jeronimo", "Pedigree", 2, "Pastor aleman");
        
        perro1.alimentarse();
        perro2.alimentarse();
        
        Animal gato = new Gato("Pelusa", "Galletas", 10, "Siames");
        gato.alimentarse();
        
        Animal caballo = new Caballo("Spirit", "Pasto", 25, "Salvaje");
        caballo.alimentarse();
        
    }

}
