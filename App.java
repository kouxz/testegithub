import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

       // Programa para ver a altura média e mostrar a porcentagem de pessoas menores de 15 anos

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scn.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa");
            System.out.print("Nome: ");
            nomes[i] = scn.next();
            System.out.print("Idade: ");
            idades[i] = scn.nextInt();
            System.out.print("Altura: ");
            alturas[i] = scn.nextDouble();
        }

        double soma = 0;
        for(int i = 0; i < n; i++) {
            soma = soma + alturas[i];
        } 
        double mediaAlturas = soma / n;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        int cont = 0;
        for(int i = 0; i < n; i++) {
            if (idades[i] < 15) {
                cont = cont + 1;
            }
        }

        double percent = cont * 100.0 / n;
        System.out.printf("Pessoas com menos de 15 anos: %.1f%%%n", percent);
        
        for(int i = 0; i < n; i++) {
            if (idades[i] < 15) {
               System.out.println(nomes[i]); 
            }
        }

        scn.close();
    }
}
