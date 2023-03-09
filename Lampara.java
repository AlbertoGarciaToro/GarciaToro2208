public class Lampara {
    private String color;
    private String Tamaño;
    private int peso;

    public Lampara(String color, String tamaño, int peso) {
        this.color = color;
        Tamaño = tamaño;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "color='" + color + '\'' +
                ", Tamaño='" + Tamaño + '\'' +
                ", peso=" + peso +
                '}';
    }
}
