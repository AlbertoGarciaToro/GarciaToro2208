public class Giroscopio {
    private String color;
    private int tamañoCM;
    private int peso;

    public Giroscopio(String color, int tamañoCM, int peso) {
        this.color = color;
        this.tamañoCM = tamañoCM;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamañoCM() {
        return tamañoCM;
    }

    public void setTamañoCM(int tamañoCM) {
        this.tamañoCM = tamañoCM;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "color='" + color + '\'' +
                ", tamañoCM=" + tamañoCM +
                ", peso=" + peso +
                '}';
    }
}

