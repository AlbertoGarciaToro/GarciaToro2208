package Genericos;

import java.util.ArrayList;

public class DriverCaja {
    public static void main(String[] args) {
        Caja<String> caja =new Caja<>(new String[10]);
        caja.add(0,"hola");
        caja.add(1,"adios");
        caja.add(2,"hi");
        System.out.println(caja);
        String temp= caja.get(0);

        System.out.println("-------------");
        CajaSinGenericos cajaSin=new CajaSinGenericos(new Object[10] );
        cajaSin.add(0,"hola");
        cajaSin.add(1,"adios");
        cajaSin.add(2,"hi");
        System.out.println(cajaSin);
        String temp2=(String) cajaSin.get(0);
        System.out.println("-----COMIDA------");
        Caja<Comida> cajaComida=new Caja<>(new Comida[10]);
        cajaComida.add(0,new Comida("Yogurth",true));
        System.out.println(cajaComida.get(0));
        ArrayList<Comida> comidas=new ArrayList<>();
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("manzana",false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(4));
        ArrayList<Comida> comidas2= new ArrayList<>();
        comidas2.add(new Comida("Zanahoria",false));
        comidas2.add(new Comida("Yogurth",true));
        comidas2.add(new Comida("Danonino",true));
        comidas2.add(new Comida("Manzana",false));
        comidas2.add(new Comida("Bisteck",false));
        System.out.println(comidas2.get(3));
        comidas2.set(3,new Comida("fresa",false));
        comidas2.add(3,new Comida("Naranja",false));
        System.out.println("-----Final----");
        for (Comida comida:comidas2) {
            System.out.println(comida);
        }
    }
}
