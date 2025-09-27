import java.util.Scanner;
import java.lang.Math;

public class Atividade6
    {
        public static void main (String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite a velocidade do vento em m/s: ");
            double velocidade_vento = entrada.nextFloat();
            System.out.printf ("Digite a temperatura térmica em graus Celsius: ");
            double temperatura_celsius = entrada.nextFloat();

            double velocidade_vento2 = Math.sqrt (velocidade_vento);

            double primeira_parte = (10 * velocidade_vento2);
            double segunda_parte = 10.45 - velocidade_vento;
            double terceira_parte = (temperatura_celsius -33)/22;

            double sensacao_termica = 33 + (primeira_parte + segunda_parte) * terceira_parte;

            System.out.printf ("A sensão térmica em graus Célsius é: %f.3", sensacao_termica);
        }
    }
