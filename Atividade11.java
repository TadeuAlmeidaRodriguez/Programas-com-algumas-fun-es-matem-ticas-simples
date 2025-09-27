import java.util.Scanner;
import java.lang.Math;

public class Atividade11
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            double termo_a;
            double termo_b;
            double termo_c;
            double delta_base;
            double delta_final;
            double primeira_raiz;
            double segunda_raiz;

            System.out.printf ("Digite o primeiro termo (x²): ");
            termo_a = entrada.nextFloat();
            System.out.printf ("Digite o segundo termo (x¹): ");
            termo_b = entrada.nextFloat();
            System.out.printf ("Digire o termo independente: ");
            termo_c = entrada.nextFloat();

            delta_base = (Math.pow (termo_b,2) -4 * termo_a * termo_c);
            delta_final = Math.sqrt (delta_base);

            primeira_raiz = (-termo_b + delta_final)/(2*termo_a);
            segunda_raiz = (-termo_b - delta_final)/(2*termo_a);

            System.out.printf ("A primeira raiz é: %.2f\n", primeira_raiz);
            System.out.printf ("A segunda raiz é: %.2f\n", segunda_raiz);
        }
    }
