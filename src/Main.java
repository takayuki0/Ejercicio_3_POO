public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Sun", "Tzu", "El arte de la guerra", 25);
        Libro libro2 = new Libro("Robert", "Kiyosaki", "Padre Rico Padre Pobre", 30);
        Libro libro3 = new Libro("Robin", "S. Sharma", "El Club de las 5 de la Mañana", 40);

        Pelicula pelicula1 = new Pelicula("Braindead", "Timothy", "Balme", "Peter", "Jackson", 45);
        Pelicula pelicula2 = new Pelicula("The Lord of the Ring", "Elijah", "Wood", "Peter", "Jackson", 60);
        Pelicula pelicula3 = new Pelicula("Forrest Gump", "Tom", "Hanks", "Robert", "Zemeckis", 65);

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(pelicula3);

        libro1.esIgual(libro3.getAutorLibro());
        libro2.esIgual(new Persona("Elijah", "Wood"));
        pelicula1.esIgual(pelicula2.getProtagonistaPelicula());
        pelicula2.esIgual(new Persona("Peter", "Jackson"));


    }
}