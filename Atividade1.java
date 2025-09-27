import java.util.Scanner;
import java.lang.Math;

public class Atividade1
    {
        public static void main(String[] args)
        {
           Scanner entrada = new Scanner(System.in);
           System.out.printf ("Digite um número: ");
           float numero = entrada.nextFloat();
           float numero_absoluto = Math.abs(numero);
           System.out.printf ("O valor do número em módulo é: %.1f", numero_absoluto);
        }
    }
