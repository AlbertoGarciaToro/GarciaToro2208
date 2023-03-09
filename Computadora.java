public class Computadora {
    private String Marca;
    private String modelo;
    private String pulgadasMonitor;

    public Computadora(String marca, String modelo, String pulgadasMonitor) {
        Marca = marca;
        this.modelo = modelo;
        this.pulgadasMonitor = pulgadasMonitor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPulgadasMonitor() {
        return pulgadasMonitor;
    }

    public void setPulgadasMonitor(String pulgadasMonitor) {
        this.pulgadasMonitor = pulgadasMonitor;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "Marca='" + Marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pulgadasMonitor='" + pulgadasMonitor + '\'' +
                '}';
    }
}
