package InterfazDeAutomovil;

public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion= new Camion("Diesel",3);
        System.out.println("-----CAMION-----");
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("----MOTOCICLETA-----");
        Motocicleta motocicleta =new Motocicleta(150,"Yamaha");
        motocicleta.encender();
        motocicleta.avanzar();
        motocicleta.hacerCaballito();
        motocicleta.frenar();
        motocicleta.apagar();
        //Garcia Toro Alberto 2208




    }
}
