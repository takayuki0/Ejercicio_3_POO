public class Libro {
    private Persona autorLibro;
    private String tituloLibro;
    private float precioLibro;

    public Libro(String nombreAutor, String apellidoAutor, String tituloLibro, float precioLibro) {
        autorLibro = new Persona(nombreAutor, apellidoAutor);
        this.tituloLibro = tituloLibro;
        this.precioLibro = precioLibro;
    }

    public Persona getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(Persona autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public float getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(float precioLibro) {
        this.precioLibro = precioLibro;
    }

    public void esIgual(Persona p) {
        if (autorLibro.esIgual(p)) {
            System.out.println("Los nombres son iguales.");
        } else {
            System.out.println("Los nombres no son iguales.");
        }
    }

    @Override
    public String toString() {
        return "__________________________________________\nLibro: " + tituloLibro +
                "\nAutor: " + autorLibro.getNombre() + " " + autorLibro.getApellido() +
                "\nPrecio €: " + precioLibro +
                "\n__________________________________________";
    }
}
