public class MaquinaCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public MaquinaCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public boolean verificarRecursos(int aguaNecesaria, int cafeNecesario, int cremaNecesaria) {
        return (this.agua >= aguaNecesaria && this.cafe >= cafeNecesario && this.crema >= cremaNecesaria && this.vasos > 0);
    }

    public void americano() {
        if (verificarRecursos(180, 15, 0)) {
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos--;
            System.out.println("Claro enseguida sale un cafe americano");
        } else {
            System.out.println("El cafe americano se necuentra agotado");
        }
    }

    public void expreso() {
        if (verificarRecursos(120, 20, 0)) {
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos--;
            System.out.println("Claro enseguida sale un cafe expreso");
        } else {
            System.out.println("El cafe expreso se necuentra agotado");
        }
    }

    public void capuchino() {
        if (verificarRecursos(100, 14, 70)) {
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos--;
            System.out.println("Claro enseguida sale un cafe capuchino");
        } else {
            System.out.println("El cafe capuchino se necuentra agotado");
        }
    }

    public void Recursos() {
        System.out.println("Recursos:");
        System.out.println("Agua: " + this.agua + " ml");
        System.out.println("Café: " + this.cafe + " g");
        System.out.println("Crema: " + this.crema + " ml");
        System.out.println("Vasos: " + this.vasos);
    }

    public static void main(String[] args) {
        MaquinaCafe cafe1 = new MaquinaCafe();
        cafe1.Recursos();
        cafe1.capuchino();
        cafe1.capuchino();
        cafe1.capuchino();
        cafe1.capuchino();
        cafe1.capuchino();
        cafe1.capuchino();
        cafe1.capuchino();
        cafe1.capuchino();
        cafe1.Recursos();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.americano();
        cafe1.Recursos();
        cafe1.expreso();
        cafe1.expreso();
        cafe1.expreso();
        cafe1.expreso();
        cafe1.expreso();
        cafe1.expreso();
        cafe1.expreso();
        cafe1.expreso();
        cafe1.expreso();
        cafe1.expreso();
        cafe1.expreso();
        cafe1.expreso();
        cafe1.Recursos();

    }

}
