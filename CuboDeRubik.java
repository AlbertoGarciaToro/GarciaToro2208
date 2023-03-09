public class CuboDeRubik {
    private String color;
    private int numeroCaras;
    private int pesoGramos;

    public CuboDeRubik(String color, int numeroCaras, int pesoGramos) {
        this.color = color;
        this.numeroCaras = numeroCaras;
        this.pesoGramos = pesoGramos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroCaras() {
        return numeroCaras;
    }

    public void setNumeroCaras(int numeroCaras) {
        this.numeroCaras = numeroCaras;
    }

    public int getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(int pesoGramos) {
        this.pesoGramos = pesoGramos;
    }

    @Override
    public String toString() {
        return "CuboDeRubik{" +
                "color='" + color + '\'' +
                ", numeroCaras=" + numeroCaras +
                ", pesoGramos=" + pesoGramos +
                '}';
    }
}
