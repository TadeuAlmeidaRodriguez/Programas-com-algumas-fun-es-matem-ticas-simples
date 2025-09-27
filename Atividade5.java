import java.util.Scanner;
import java.lang.Math;

public class Atividade5
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);
            System.out.printf ("Digite o raio da esfera: ");
            double circuferencia = entrada.nextFloat();
            double circuferencia_calculo = Math.pow (circuferencia,2);
            double area_circuferencia = Math.PI * circuferencia_calculo;

            System.out.printf ("A área da circuferência é: %.1f unidades de área ao quadrado", area_circuferencia);
        }
    }
