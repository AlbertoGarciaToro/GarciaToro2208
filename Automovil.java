public class Automovil {
    private String marca;
    private int modelo;
    private int numCaballos;

    public Automovil(String marca, int modelo, int numCaballos) {
        this.marca = marca;
        this.modelo = modelo;
        this.numCaballos = numCaballos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getNumCaballos() {
        return numCaballos;
    }

    public void setNumCaballos(int numCaballos) {
        this.numCaballos = numCaballos;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", numCaballos=" + numCaballos +
                '}';
    }
}
