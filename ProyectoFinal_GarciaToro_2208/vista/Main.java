package vista;

import controlador.ControladorHoroscopo;

public class Main {
    public static void main(String[] args) {
        VentanaHoroscopo view=new VentanaHoroscopo("Horoscopos");
        ControladorHoroscopo contoller=new ControladorHoroscopo(view);
    }
}