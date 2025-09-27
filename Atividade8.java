import java.util.Scanner;

 public class Atividade8
    {
        public static void main (String[] args)
        {
            Scanner entrada = new Scanner (System.in);
            System.out.printf ("Digite a temperatura em graus Celius (°C): ");
            double temperatura_celsius = entrada.nextFloat();

            double fah = (9 * temperatura_celsius+160)/5;

            System.out.printf ("A temperatura em gruas Fahrenheit (°F): %.1f", fah);
        }
    }
