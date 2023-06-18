public class Pelicula {
    private String tituloPelicula;
    private Persona protagonistaPelicula;
    private Persona directorPelicula;
    private float precioPelicula;

    public Pelicula(String tituloPelicula, String nombreProtagonista, String apellidoProtagonista, String nombreDirector, String apellidoDirector, float precioPelicula) {
        this.tituloPelicula = tituloPelicula;
        protagonistaPelicula = new Persona(nombreProtagonista, apellidoProtagonista);
        directorPelicula = new Persona(nombreDirector, apellidoDirector);
        this.precioPelicula = precioPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public Persona getProtagonistaPelicula() {
        return protagonistaPelicula;
    }

    public void setProtagonistaPelicula(Persona protagonistaPelicula) {
        this.protagonistaPelicula = protagonistaPelicula;
    }

    public Persona getDirectorPelicula() {
        return directorPelicula;
    }

    public void setDirectorPelicula(Persona directorPelicula) {
        this.directorPelicula = directorPelicula;
    }

    public float getPrecioPelicula() {
        return precioPelicula;
    }

    public void setPrecioPelicula(float precioPelicula) {
        this.precioPelicula = precioPelicula;
    }

    public void esIgual(Persona p) {
        if (protagonistaPelicula.esIgual(p) || directorPelicula.esIgual(p)) {
            System.out.println("Los nombres son iguales.");
        } else {
            System.out.println("Los nombres no son iguales.");
        }
    }

    @Override
    public String toString() {
        return "__________________________________________\nPelícula: " + tituloPelicula +
                "\nProtagonista: " + protagonistaPelicula.getNombre() + " " + protagonistaPelicula.getApellido() +
                "\nDirector: " + directorPelicula.getNombre() + " " + directorPelicula.getApellido() +
                "\nPrecio €: " + precioPelicula +
                "\n__________________________________________";
    }
}
