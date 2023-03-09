public class Persona {
    private String nacionalidad;
    private int edadAños;
    private int alturaCM;

    public Persona(String nacionalidad, int edadAños, int alturaCM) {
        this.nacionalidad = nacionalidad;
        this.edadAños = edadAños;
        this.alturaCM = alturaCM;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdadAños() {
        return edadAños;
    }

    public void setEdadAños(int edadAños) {
        this.edadAños = edadAños;
    }

    public int getAlturaCM() {
        return alturaCM;
    }

    public void setAlturaCM(int alturaCM) {
        this.alturaCM = alturaCM;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nacionalidad='" + nacionalidad + '\'' +
                ", edadAños=" + edadAños +
                ", alturaCM=" + alturaCM +
                '}';
    }
}
