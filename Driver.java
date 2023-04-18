public class Driver {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("Terrestre","Combustion interna",400,"Tsuru","Sport",1990,"Tipo B","Con permiso de transporte publico","Tiempo/distancia");
        taxi.encender();
        taxi.apagar();
        taxi.acelerar();
        taxi.frenar();
        taxi.conducirDestino();
        taxi.cobrarPasaje();
        System.out.println(taxi);
    }
}
