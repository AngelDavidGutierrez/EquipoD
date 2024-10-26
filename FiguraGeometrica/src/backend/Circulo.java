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

         // Preguntar al usuario si desea cambiar el color
        System.out.print("¿Desea cambiar el color por defecto (blanco)? (true/false): ");
        while (!scanner.hasNextBoolean()) {
            System.out.println("Entrada no válida. Por favor ingrese true o false.");
            scanner.next(); // Limpiar la entrada inválida
            System.out.print("¿Desea cambiar el color por defecto (blanco)? (true/false): ");
        }
        boolean cambiarColor = scanner.nextBoolean();
        if (cambiarColor) {
            System.out.print("Ingrese el nuevo color del círculo: ");
            color = scanner.next();
        }

        // Preguntar al usuario si desea cambiar el relleno
        System.out.print("¿Desea cambiar el relleno por defecto (false)? (true/false): ");
        while (!scanner.hasNextBoolean()) {
            System.out.println("Entrada no válida. Por favor ingrese true o false.");
            scanner.next(); // Limpiar la entrada inválida
            System.out.print("¿Desea cambiar el relleno por defecto (false)? (true/false): ");
        }
        boolean cambiarRelleno = scanner.nextBoolean();
        if (cambiarRelleno) {
            relleno = true; // Cambiar a true si el usuario lo desea
        }
        
        // Ingresar el radio
        double radio = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.print("Ingrese el radio del círculo: ");
            if (scanner.hasNextDouble()) {
                radio = scanner.nextDouble();
                if (radio < 0) {
                    System.out.println("El radio no puede ser negativo, intente nuevamente");
                } else {
                    entradaValida = true;
                }
            } else {
                System.out.println("Entrada no válida. Por favor ingrese un número.");
                scanner.next();
            }
        }

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
        return "Círculo [color=" + getColor() + ", relleno=" + isRelleno() + 
               ", fechaCreacion=" + getFechaCreacion() + 
               ", radio=" + radio + ", área=" + calcularArea() + 
               ", perímetro=" + calcularPerimetro() + "]";
    }
}


