//En este ejercicio como lo indica el enunciado creamos nuestra clase llamada persona
public class Persona {

    //En esta clase declaramos nuestras variables nombre y apellido que serán los atributos de nuestra clase Persona
    private String nombre;
    private String apellido;

    //Creamos nuestro constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Creamos nuestros metodos setter and getter para cada una de nuestras variables
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Y muy importante, creamos nuestro método esIgual() el cual sera un metodo que nos devolverá true o false
    //si los nombres comparados son iguales nos retornará un valor de tipo boolean
    public boolean esIgual(Persona p) {
        return this.nombre.equals(p.nombre) && this.apellido.equals(p.apellido);
    }

}
