import java.util.Scanner;

public class exercicio11 {
    public static void main(String[]arg){

        Scanner e=new Scanner(System.in);

        System.out.println("escreva o ano que vc nasceu!");

        int nascido=e.nextInt();
        int idade= 2026-nascido;
        int idade2= 2030-nascido;

        System.out.printf("a sua idade no ano de 2026 sera de: %d. E a sua idade em 2030 sera de: %d\n",idade,idade2);
    }
}
