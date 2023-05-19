import java.util.Scanner;
/**
 * 
 * @author Jorge godoy
 *
 */
public class Practica2	 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una forma geométrica: (triángulo, cuadrado o círculo)");
        String forma = scanner.nextLine();
        double area, perimetro;
        /**
         * Le decimos al ursuario que escoja una forma geometrica	
         */
        switch(forma) {
            case "triangulo":
                System.out.println("Introduzca la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.println("Introduzca la altura del triangulo: ");
                double altura = scanner.nextDouble();
                area = (base * altura) / 2;
                perimetro = 3 * base;
                break;
                /**
                 * En el triangulo le pedimos al ursuario la base y la altura para calcular el area
                 * y el perimetro
                 */
            case "cuadrado":
                System.out.println("Introduzca la longitud del cuadrado: ");
                double longitud = scanner.nextDouble();
                area = longitud * longitud;
                perimetro = 4 * longitud;
                break;
                /**
                 * En el cuadrado le pedimos al ursuario la longitud para calcular el area
                 * y el perimetro
                 */
            case "circulo":
                System.out.println("Introduzca el radio del circulo: ");
                double radio = scanner.nextDouble();
                area = Math.PI * radio * radio;
                perimetro = 2 * Math.PI * radio;
                break;
                /**
                 * En el circulo le pedimos al ursuario la base y la altura para calcuular el area
                 */
            default:
                System.out.println("Forma no válida seleccionada.");
                return;
                /**
                 * si escoge una opcion que no se aha dado saldra ese mensaje
                 */
        }
        System.out.println("La " + forma + " tiene un area de " + area + ", y un perímetro de " + perimetro	 + ".");
        /**
         *Le mostramos los resultados de la forma geometrica escogida
         */
    }
}