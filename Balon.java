public class Balon {
    private String categoria;
    private String color;
    private int peso;

    public Balon(String categoria, String color, int peso) {
        this.categoria = categoria;
        this.color = color;
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "categoria='" + categoria + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                '}';
    }
}
