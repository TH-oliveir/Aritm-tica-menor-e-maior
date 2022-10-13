import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int soma;
        int media;
        int produto;

        System.out.println("Digite um primeiro numero:  ");
        numero1 = ler.nextInt();
        System.out.println("Digite segundo numero:  ");
        numero2 = ler.nextInt();
        System.out.println("Digite terceiro numero:  ");
        numero3 = ler.nextInt();

        soma = numero1 + numero2 + numero3;
        media = (int) (soma / 3.0);
        produto = numero1 * numero2 * numero3;

        System.out.println("A soma dos numeros:   "+soma);
        System.out.println("A media dos numeros:"+media);
        System.out.println("A multiplicacao dos numeros:   "+produto);

        if (numero1 > numero2) {

            System.out.println(" Primeiro é maior"+numero1);
        } else if (numero2 < numero1) {
            System.out.println("é segundo numero e maior" +numero2);
        }
        else if(numero3 < numero1){

            System.out.println("é terceiro numero e maior" +numero3);
        }
        else if(numero3 > numero2){

                System.out.println("é terceiro numero e maior" +numero3);

        }else{

            System.out.println(" Os números são iguais");

        }





         




    }
}
