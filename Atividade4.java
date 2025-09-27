import java.util.Scanner;

public class Atividade4
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);
            System.out.printf ("Digite a primeira nota do aluno: ");
            float primeira_nota = entrada.nextFloat();
            System.out.printf ("Digite a segunda nota do aluno: ");
            float segunda_nota = entrada.nextFloat();
            System.out.printf ("Digite a terceira nota do aluno: ");
            float terceira_nota = entrada.nextFloat();

            float media_final = (primeira_nota + segunda_nota + terceira_nota)/3;

            System.out.printf ("A média do aluno é: %.1f", media_final);
        }
    }
