import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner e=new Scanner(System.in);

        System.out.println("Didite dois numeros!");

        double num1=e.nextDouble();
        double num2=e.nextDouble();
        double soma=e.nextDouble();

        System.out.println("esses sao os numeros que vc escolheu:"+num1+" e "+num2);

        System.out.println("essas sao as somas desses numeros: "+soma);


    }
}