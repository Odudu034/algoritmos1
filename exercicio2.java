import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){

        Scanner e=new Scanner(System.in);

        System.out.println("Digite as notas dos alunos ");

        double nota1=e.nextDouble();
        double nota2=e.nextDouble();
        double nota3=e.nextDouble();
        double media= (nota1+nota2+nota3)/3;

        System.out.printf("Essa e a sua media %.2f.\n",media);


    }
}
