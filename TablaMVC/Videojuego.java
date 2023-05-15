package TablaMVC;

public class Videojuego {
    private int id;
    private String nombre;
    private String genero;
    private Double peso;
    private double pesoEnGB;
    private String plataforma;
    private String desarrollador;

    public Videojuego() {
    }

    public Videojuego(int id, String nombre, String genero, Double peso, double pesoEnGB, String plataforma, String desarrollador) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
        this.pesoEnGB = pesoEnGB;
        this.plataforma = plataforma;
        this.desarrollador = desarrollador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public double getPesoEnGB() {
        return pesoEnGB;
    }

    public void setPesoEnGB(double pesoEnGB) {
        this.pesoEnGB = pesoEnGB;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", peso=" + peso +
                ", pesoEnGB=" + pesoEnGB +
                ", plataforma='" + plataforma + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                '}';
    }
}
