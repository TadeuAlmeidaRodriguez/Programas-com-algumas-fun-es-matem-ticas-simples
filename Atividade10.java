import java.util.Scanner;
import java.lang.Math;

public class Atividade10
    {
        public static void main(String[] args)
        {
            double cateto_a;
            double cateto_b;
            double hipotenusa_base;
            double hipotenusa_final;

            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite o cateto A do triângulo: ");
            cateto_a = entrada.nextFloat();
            System.out.printf ("Digite o cateto B do triâgulo: ");
            cateto_b = entrada.nextFloat();

            hipotenusa_base = Math.pow (cateto_a,2) + Math.pow (cateto_b,2);
            hipotenusa_final = Math.sqrt (hipotenusa_base);

            System.out.printf ("A hipotenusa desse triângulo é: %.1f unidades de medida", hipotenusa_final);

        }
    }
