import java.util.Scanner;

public class Atividade3
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);
            System.out.printf ("Digite o valor da base menor do trapézio: ");
            float base_menor = entrada.nextFloat();
            System.out.printf ("Digite o valor da base maior do trapézio: ");
            float base_maior = entrada.nextFloat();
            System.out.printf ("Digite a altura do trapézio: ");
            float valor_altura = entrada.nextFloat();

            float area_trapezio = ((base_maior + base_menor)/2) * valor_altura;

            System.out.printf ("O valor da área é: %.1f", area_trapezio);
        }
    }
