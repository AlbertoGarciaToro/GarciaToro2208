public class Automovil extends Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public Automovil(String tipoCategoria, String tipoMotor, int autonomiaKm, String marca, String modelo, int año) {
        super(tipoCategoria, tipoMotor, autonomiaKm);
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", tipoCategoria='" + tipoCategoria + '\'' +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", autonomiaKm=" + autonomiaKm +
                '}';
    }
    public void acelerar(){
        System.out.println("El autmovil esta acelerando");
    }
    public void frenar(){
        System.out.println("El automovil esta frenando");
    }

}

