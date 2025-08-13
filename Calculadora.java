// Analisis
/* 
 * Descripcion: La calculadora debera pedirle al ususario 2 numeros
 * y esos 2 nuemros realizafr suma, resdta, multipliacacion, division y modulo
 * Entradas: 2, numero 1 y numero 2, ambos ingresados por el usuario
 * Salidas: 5, una por cada resultado de la operacion aritmetica
 */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double  numero1, numero2;

        System.out.println("por favorcito deme el primer numerito");
        numero1 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("El numero que ingresaste es: " + numero1);

        
        System.out.println("por favorcito deme el segundo numerito");
        numero2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("El numero que ingresaste es: " + numero2);

       double suma, resta, multiplicacion, modulo, division; // Declaracion
        suma = sumar(numero1, numero2);
        resta = restar(numero1, numero2);
        multiplicacion = numero1 * numero2;
        modulo = numero1 % numero2;
        division = numero1 / numero2; 

         System.out.println("El resultado de la suma es: " + suma);
         System.out.println("El resultado de la resta es: " + resta);
         System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
         System.out.println("El resultado del modulo es: " + modulo);



    
    }
public static double sumar(double a, double b) {
        double suma = a + b;
        return suma;
}
    public static double restar(double a, double b) {
        return a - b;
    }
    
}      

