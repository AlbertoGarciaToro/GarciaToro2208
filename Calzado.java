public class Calzado {
    private String marca;
    private String colores;
    private int medidaCm;

    public Calzado(String marca, String colores, int medidaCm) {
        this.marca = marca;
        this.colores = colores;
        this.medidaCm = medidaCm;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public int getMedidaCm() {
        return medidaCm;
    }

    public void setMedidaCm(int medidaCm) {
        this.medidaCm = medidaCm;
    }

    @Override
    public String toString() {
        return "Calzado{" +
                "marca='" + marca + '\'' +
                ", colores='" + colores + '\'' +
                ", medidaCm=" + medidaCm +
                '}';
    }
}
