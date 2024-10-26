package FigurasGeometricas;

import backend.Circulo;
import java.util.Scanner;

public class MenuFiguras {
    public static void main(String[] args) {
        Menu();
    }
    private static void Menu(){
        
        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;
        
        while(opcion !=4){
            System.out.println("Menu de figuras geometricas");
            System.out.println("1. Crear circulo");
            System.out.println("2. Crear Triangulo");
            System.out.println("3. Crear rectangulo");
            System.out.println("4. Salir");
            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    Circulo circulo = Circulo.crearCirculo(scanner);
                    
                    System.out.println("Circulo creado: " + circulo.toString());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el aplicativo");
                    break;
                default:
                System.out.println("El numero ingresado no es valido");
                    
            }
        }
    }
}
    