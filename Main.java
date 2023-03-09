public class Main {
    public static void main(String[] args) {

        Pais ps=new Pais("MEXICO",127000000,55884);
        ps.setNombre("España");
        System.out.println(ps);

        Giroscopio gir=new Giroscopio("Gris",20,300);
        System.out.println(gir);
        Computadora cp=new Computadora("lenovo","2020","24");
        System.out.println(cp);
        CuboDeRubik cr=new CuboDeRubik("blanco, rojo, azul, naranja, verde y amarillo",6,120);
        System.out.println(cr);
        Libro lib=new Libro("El principito","Tomo Books Mx.",120);
        System.out.println(lib);
        Balon bal=new Balon("Porfesiona","Blanco y Negro",450);
        System.out.println(bal);
        Lampara lam=new Lampara("Blanco","1 metro",700);
        System.out.println(lam);
        Gato gat=new Gato(2,5,"Felix");
}
}