import java.util.Scanner;

public class Atividade7
    {
        public static void main (String[] args)
        {
            Scanner entrada = new Scanner (System.in);
            System.out.printf ("Digite o salário fixo do vendedor em reais (R$): ");
            double salario_fixo = entrada.nextFloat();
            System.out.printf ("Digite o total de vendas desse mês do vendedor em reais (RS): ");
            double total_vendas = entrada.nextFloat();

            double comissao = total_vendas * 0.15;
            double salario_final = salario_fixo + comissao;

            System.out.printf ("O valor do salário total do vendedor é: %.2f R$", salario_final);


        }
    }
