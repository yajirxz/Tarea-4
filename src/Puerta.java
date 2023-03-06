public class Puerta {

    // Atributos
    private String material;
    private String color;
    private boolean conVidrio;
    private int ancho;
    private int alto;

    // Constructores
    public Puerta(String material, String color, boolean conVidrio, int ancho, int alto) {
        this.material = material;
        this.color = color;
        this.conVidrio = conVidrio;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Puerta() {
        this.material = "Madera";
        this.color = "Café";
        this.conVidrio = false;
        this.ancho = 80;
        this.alto = 200;
    }

    // Métodos de acceso
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isConVidrio() {
        return conVidrio;
    }

    public void setConVidrio(boolean conVidrio) {
        this.conVidrio = conVidrio;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    // Método toString
    @Override
    public java.lang.String toString() {
        return "Puerta{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", conVidrio=" + conVidrio +
                ", ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }

    // Métodos de uso general
    public void abrir() {
        System.out.println("La puerta se está abriendo");
    }

    public void cerrar() {
        System.out.println("La puerta se está cerrando");
    }

    public void pintar(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("La puerta se ha pintado de " + nuevoColor);
    }

}
