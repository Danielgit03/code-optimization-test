import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
// profe pongame 5 todo bien :) 


Scanner scan =new Scanner(System.in);

        final int LIMIT_AGE = 18;
        System.out.println("Ingrese su edad ");
        int edad =scan.nextInt();

        if (edad >= LIMIT_AGE) {
            System.out.println("Es mayor de edad");
        }
        
        if (edad < LIMIT_AGE) {
            System.out.println("Es menor de edad");
        }
    }
}