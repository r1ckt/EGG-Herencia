
package ejercicio_01;

public final class Caballo extends Animal {

    public Caballo(){
        
    }
    
    public Caballo(String nombre, String alimento, int edad, String raza){
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println(this.nombre + " se alimenta con " + this.alimento);
    }
}
