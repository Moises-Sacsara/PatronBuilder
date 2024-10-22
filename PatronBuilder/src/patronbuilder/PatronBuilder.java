package patronbuilder;

public class PatronBuilder {

    public static void main(String[] args) {
        Libro libroFisico = new Libro.LibroBuilder("Ciencias")
                .agregarAutor("Mariano")
                .agregarResena("Un gran libro.")
                .tipoFisico(900)
                .build();

        Libro libroDigital = new Libro.LibroBuilder("Programacion")
                .agregarAutor("Gabriel")
                .agregarResena("Bien explicado.")
                .tipoDigital("PDF", 5.6)
                .build();

        Libro audiolibro = new Libro.LibroBuilder("Autoayuda")
                .agregarAutor("Emiliano")
                .agregarResena("Muy motivador.")
                .tipoAudio("MP3", 12.5)
                .build();

        System.out.println(libroFisico);
        System.out.println(libroDigital);
        System.out.println(audiolibro);
    }
    
}
