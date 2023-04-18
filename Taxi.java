public class Taxi extends Automovil{
    private String tipoLicencia;
    private String tipoTarjetaCirculacion;
    private String taximeto;

    public Taxi() {
    }

    public Taxi(String tipoCategoria, String tipoMotor, int autonomiaKm, String marca, String modelo, int año, String tipoLicencia, String tipoTarjetaCirculacion, String taximeto) {
        super(tipoCategoria, tipoMotor, autonomiaKm, marca, modelo, año);
        this.tipoLicencia = tipoLicencia;
        this.tipoTarjetaCirculacion = tipoTarjetaCirculacion;
        this.taximeto = taximeto;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public String getTipoTarjetaCirculacion() {
        return tipoTarjetaCirculacion;
    }

    public void setTipoTarjetaCirculacion(String tipoTarjetaCirculacion) {
        this.tipoTarjetaCirculacion = tipoTarjetaCirculacion;
    }

    public String getTaximeto() {
        return taximeto;
    }

    public void setTaximeto(String taximeto) {
        this.taximeto = taximeto;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "tipoLicencia='" + tipoLicencia + '\'' +
                ", tipoTarjetaCirculacion='" + tipoTarjetaCirculacion + '\'' +
                ", taximeto='" + taximeto + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", tipoCategoria='" + tipoCategoria + '\'' +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", autonomiaKm=" + autonomiaKm +
                '}';
    }

    public void conducirDestino(){
        System.out.println("El taxista conduce al destino");
    }
    public void cobrarPasaje(){
        System.out.println("El taxista esta cobrando el pasaje");
    }
}
