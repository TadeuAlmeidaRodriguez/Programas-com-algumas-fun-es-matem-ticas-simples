import java.util.Scanner;

public class Atividade9
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);
            System.out.printf ("Digite o valor da compra do produto em reais R$: ");
            double valor_compra = entrada.nextFloat();
            System.out.printf ("Digite o valor em reais R$ com o produto: ");
            double gastos_gerais = entrada.nextFloat();
            System.out.printf ("Digite o valor em reais R$ da venda do produto: ");
            double valor_venda = entrada.nextFloat();

            double custo_total = (valor_compra + gastos_gerais);
            double lucro_real = (valor_venda - custo_total);

            System.out.printf ("O valor de lucro em reais é de : %.2f R$\n", lucro_real);

            double lucro_percentual = (lucro_real/custo_total)*100;

            System.out.printf ("O lucro percentual é de:%.2f %%", lucro_percentual);
        }
    }
