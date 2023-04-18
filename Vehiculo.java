public class Vehiculo {
    protected String tipoCategoria;
    protected String tipoMotor;
    protected int autonomiaKm;

    public Vehiculo() {
    }

    public Vehiculo(String tipoCategoria, String tipoMotor, int autonomiaKm) {
        this.tipoCategoria = tipoCategoria;
        this.tipoMotor = tipoMotor;
        this.autonomiaKm = autonomiaKm;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(int autonomiaKm) {
        this.autonomiaKm = autonomiaKm;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipoCategoria='" + tipoCategoria + '\'' +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", autonomiaKm=" + autonomiaKm +
                '}';
    }
    public void encender(){
        System.out.println("El vehiculo esta encendido");
    }
    public void apagar(){
        System.out.println("El vehiculo esta apagado");
    }
}
