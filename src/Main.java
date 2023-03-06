public class Main {
    public static void main(String[] args) {

       //Puerta
        Puerta miPuerta = new Puerta("Madera", "Café", true, 80, 200);


        System.out.println(miPuerta.getMaterial());// Madera
        System.out.println(miPuerta.getColor()); // Café
        System.out.println(miPuerta.isConVidrio()); // true
        System.out.println(miPuerta.getAncho()); // 80
        System.out.println(miPuerta.getAlto()); // 200


        miPuerta.abrir(); // La puerta se está abriendo
        miPuerta.cerrar(); // La puerta se está cerrando
        miPuerta.pintar("Gris");


        System.out.println(miPuerta);


        //Perro
        Perro miPerro = new Perro("Firulais", "Meztizo", 1, "Negro", false);


        System.out.println(miPerro.getNombre()); // Firulais
        System.out.println(miPerro.getRaza()); // Mestizo
        System.out.println(miPerro.getEdad()); // 1
        System.out.println(miPerro.getColor()); // Negro
        System.out.println(miPerro.isVacunado()); // false


        miPerro.ladrar(); // ¡Guau guau!
        miPerro.correr(); // El perro está corriendo
        miPerro.vacunar(); // El perro ha sido vacunado


        System.out.println(miPerro);



    }
}
