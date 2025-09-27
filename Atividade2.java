import java.util.Scanner;
import java.lang.Math;

public class Atividade2
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite o lado de de um cubo: ");
            double lado_cubo = entrada.nextFloat();
            double volume_cubico = Math.pow (lado_cubo,3);
            System.out.printf ("O volume em unidades de medidas cubicas é: %.1f", volume_cubico);
        }
    }
