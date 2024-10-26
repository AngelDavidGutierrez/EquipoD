package backend;

import java.util.Scanner;

public class Circulo extends FiguraGeometrica {
    private double radio;

    // Constructor que incluye color y relleno
    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    // Método para pedir datos al usuario y crear el círculo
    public static Circulo crearCirculo(Scanner scanner) {
        String color = "blanco";
        boolean relleno = false;
        char respuesta1;
        char respuesta2;

        System.out.print("¿Desea cambiar el color por defecto (blanco)? Si o NO: ");
        respuesta1 = scanner.next().toUpperCase().charAt(0);
        if (respuesta1 == 'S') {
            System.out.print("Ingrese el nuevo color del círculo: ");
            color = scanner.next();
        } 

        System.out.print("¿Desea cambiar el relleno por defecto (false)? Si o NO: ");
        respuesta2 = scanner.next().toUpperCase().charAt(0);
        if (respuesta2 == 'S') {
            relleno = true; // Cambiar a true si el usuario lo desea
        } 

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Crea el objeto Circulo y devuelve
        return new Circulo(color, relleno, radio);
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Método toString
    @Override
    public String toString() {
        return "Círculo [Color: " + getColor() + ", Relleno: " + isRelleno() + 
               ", fecha de Creacion: " + getFechaCreacion() + 
               "\nRadio = " + radio + "\nÁrea = " + calcularArea() + 
               "\nPerímetro = " + calcularPerimetro() + "]\n";
    }
}

