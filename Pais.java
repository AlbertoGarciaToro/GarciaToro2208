public class Pais {
    private String nombre;

    private int habitantes;
    private int Superficie;

    public Pais(String nombre, int habitantes, int superficie) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        Superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public int getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(int superficie) {
        Superficie = superficie;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", habitantes=" + habitantes +
                ", Superficie=" + Superficie +
                '}';
    }
}
