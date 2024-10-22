package patronbuilder;

import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private List<String> autores;
    private List<String> resenas;
    private String tipo;
    private int numeroPaginas;
    private String formato;
    private double tamanoArchivo;
    private double duracionAudio;
    
    private Libro(LibroBuilder builder) {
        this.titulo = builder.titulo;
        this.autores = builder.autores;
        this.resenas = builder.resenas;
        this.tipo = builder.tipo;
        this.numeroPaginas = builder.numeroPaginas;
        this.formato = builder.formato;
        this.tamanoArchivo = builder.tamanoArchivo;
        this.duracionAudio = builder.duracionAudio;
    }

    public static class LibroBuilder {
        private String titulo;
        private List<String> autores = new ArrayList<>();
        private List<String> resenas = new ArrayList<>();
        private String tipo;
        private int numeroPaginas;
        private String formato;
        private double tamanoArchivo;
        private double duracionAudio;

        public LibroBuilder(String titulo) {
            this.titulo = titulo;
        }

        public LibroBuilder agregarAutor(String autor) {
            autores.add(autor);
            return this;
        }

        public LibroBuilder agregarResena(String resena) {
            resenas.add(resena);
            return this;
        }

        public LibroBuilder tipoFisico(int numeroPaginas) {
            this.tipo = "Fisico";
            this.numeroPaginas = numeroPaginas;
            return this;
        }

        public LibroBuilder tipoDigital(String formato, double tamanoArchivo) {
            this.tipo = "Digital";
            this.formato = formato;
            this.tamanoArchivo = tamanoArchivo;
            return this;
        }

        public LibroBuilder tipoAudio(String formato, double duracionAudio) {
            this.tipo = "Audiolibro";
            this.formato = formato;
            this.duracionAudio = duracionAudio;
            return this;
        }

        public Libro build() {
            return new Libro(this);
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autore(s)=" + autores +
                ", resena(s)=" + resenas +
                ", tipo='" + tipo + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", formato='" + formato + '\'' +
                ", tamanoArchivo=" + tamanoArchivo +
                ", duracionAudio=" + duracionAudio +
                '}';
    }
}

