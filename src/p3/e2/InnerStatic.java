package p3.e2;

import java.util.Scanner;
import static java.lang.Math.pow;

public class InnerStatic {
    static double PI= 3.1416;

    static class Circulo{
        static double radio;
        static double getArea(){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el radio del circulo:");
            setRadio(input.nextInt());
            System.out.println("Input: " + radio);
            double a = PI * pow(radio, 2);
            System.out.println("\nArea:     " + a);
            return a;
        }
        static double getLongCircunference(){
            double l = 2 * PI * radio;
            System.out.println("Circunf.: "  + l);
            return  l;
        }

        public static void setRadio(double radio) {
            Circulo.radio = radio;
        }
    }
}
