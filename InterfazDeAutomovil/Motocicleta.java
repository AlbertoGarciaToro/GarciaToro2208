package InterfazDeAutomovil;

public class Motocicleta implements Vehiculo{
    private int centrimetrosCubicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centrimetrosCubicos, String marca) {
        this.centrimetrosCubicos = centrimetrosCubicos;
        this.marca = marca;
    }

    public int getCentrimetrosCubicos() {
        return centrimetrosCubicos;
    }

    public void setCentrimetrosCubicos(int centrimetrosCubicos) {
        this.centrimetrosCubicos = centrimetrosCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centrimetrosCubicos=" + centrimetrosCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void hacerCaballito(){
        System.out.println("Haciendo un caballito");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta de marca "+marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta de marca "+marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando con la motocicleta de "+centrimetrosCubicos+" C.C.");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando con la motocicleta de "+centrimetrosCubicos+" C.C.");
    }
}
