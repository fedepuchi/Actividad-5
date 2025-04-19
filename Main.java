import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




    
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("\nn--MENU--");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Circulo");
            System.out.println("5. Pentágono");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1. Calcular perimetro, 2. Calcular area");
                    int opcion2 = scanner.nextInt();
                    if (opcion2 == 1) {
                        System.out.print("Ingrese el lado del cuadrado: ");
                        float lado = scanner.nextFloat();
                        float perimetro = lado * 4;
                        System.out.println("El perimetro del cuadrado es: " + perimetro);
                    } else if (opcion2 == 2) {
                        System.out.print("Ingrese el lado del cuadrado: ");
                        float lado = scanner.nextFloat();
                        float area = lado * lado;
                        System.out.println("El area del cuadrado es: " + area);
                    } else {
                        System.out.println("Opcion invalida");
                    }
                    
        
                    break;
                case 2:
                    System.out.println("1. Calcular perimetro, 2. Calcular area");
                    int opcion3 = scanner.nextInt();
                    if (opcion3 == 1) {
                        System.out.print("Ingrese la base del rectangulo: ");
                        float base = scanner.nextFloat();
                        System.out.print("Ingrese la altura del rectangulo: ");
                        float altura = scanner.nextFloat();
                        float perimetro = 2 * (base + altura);
                        System.out.println("El perimetro del rectangulo es: " + perimetro);
                    } else if (opcion3 == 2) {
                        System.out.print("Ingrese la base del rectangulo: ");
                        float base = scanner.nextFloat();
                        System.out.print("Ingrese la altura del rectangulo: ");
                        float altura = scanner.nextFloat();
                        float area = base * altura;
                        System.out.println("El area del rectangulo es: " + area);
                    } else {
                        System.out.println("Opcion invalida");
                        
                    }
                    break;

                case 3:
                    System.out.println("1. Calcular perimetro, 2. Calcular area");
                    int opcion4 = scanner.nextInt();
                    if (opcion4 == 1) {
                        System.out.print("Ingrese el lado del triangulo: ");
                        float lado = scanner.nextFloat();
                        float perimetro = lado * 3;
                        System.out.println("El perimetro del triangulo es: " + perimetro);
                    } else if (opcion4 == 2) {
                        System.out.print("Ingrese la base del triangulo: ");
                        float base = scanner.nextFloat();
                        System.out.print("Ingrese la altura del triangulo: ");
                        float altura = scanner.nextFloat();
                        double area = (base * altura) / 2.0;
                        System.out.println("El area del triangulo es: " + area);
                    } else {
                        System.out.println("Opcion invalida");
                        
                    }
                    break;

                case 4:
                    System.out.println("1. Calcular perimetro, 2. Calcular area");
                    int opcion5 = scanner.nextInt();
                    if (opcion5 == 1) {
                        System.out.print("Ingrese el radio del circulo: ");
                        float radio = scanner.nextFloat();
                        double perimetro = 2 * Math.PI * radio;
                        System.out.println("El perimetro del circulo es: " + perimetro);
                    } else if (opcion5 == 2) {
                        System.out.print("Ingrese el radio del circulo: ");
                        float radio = scanner.nextFloat();
                        double area = Math.PI * Math.pow(radio, 2);
                        System.out.println("El area del circulo es: " + area);
                    } else {
                        System.out.println("Opcion invalida");
                        
                    }
                    break;

                case 5 :
                    System.out.println("1. Calcular perimetro, 2. Calcular area");
                    int opcion6 = scanner.nextInt();
                    if (opcion6 == 1) {
                        System.out.print("Ingrese el lado del pentágono: ");
                        float lado = scanner.nextFloat();
                        float perimetro = lado * 5;
                        System.out.println("El perimetro del pentágono es: " + perimetro);
                    } else if (opcion6 == 2) {
                        System.out.print("Ingrese el lado del pentágono: ");
                        float lado = scanner.nextFloat();
                        System.out.print("Ingrese el apotema del pentágono: ");
                        float apotema = scanner.nextFloat();
                        double area = (5 * lado * apotema) / 2.0;
                        System.out.println("El area del pentágono es: " + area);
                    } else {
                        System.out.println("Opcion invalida");
                        
                    }
                    break;

                case 0:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
        scanner.close();  
    }
}

