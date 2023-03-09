public class Gato {
    private int pesoKG;
    private int edad;
    private String nombre;

    public Gato(int pesoKG, int edad, String nombre) {
        this.pesoKG = pesoKG;
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getPesoKG() {
        return pesoKG;
    }

    public void setPesoKG(int pesoKG) {
        this.pesoKG = pesoKG;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "pesoKG=" + pesoKG +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
