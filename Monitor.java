public class Monitor {

    private int tamañoPulgadas;
    private int modelo;
    private String marca;

    public Monitor(int tamañoPulgadas, int modelo, String marca) {
        this.tamañoPulgadas = tamañoPulgadas;
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getTamañoPulgadas() {
        return tamañoPulgadas;
    }

    public void setTamañoPulgadas(int tamañoPulgadas) {
        this.tamañoPulgadas = tamañoPulgadas;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "tamañoPulgadas=" + tamañoPulgadas +
                ", modelo=" + modelo +
                ", marca='" + marca + '\'' +
                '}';
    }
}
