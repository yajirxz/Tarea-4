public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private String color;
    private boolean vacunado;

    public Perro(String nombre, String raza, int edad, String color, boolean vacunado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.vacunado = vacunado;
    }

    public Perro() {
        this.nombre = "Firulais";
        this.raza = "Mestizo";
        this.edad = 1;
        this.color = "negro";
        this.vacunado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isVacunado() {
        return vacunado;
    }
    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    // Método toString


    @Override
    public java.lang.String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", vacunado=" + vacunado +
                '}';
    }

    // Métodos de uso general
    public void ladrar() {
        System.out.println("¡Guau guau!");
    }

    public void correr() {
        System.out.println("El perro está corriendo");
    }

    public void vacunar() {
        this.vacunado = true;
        System.out.println("El perro ha sido vacunado");
    }

}
