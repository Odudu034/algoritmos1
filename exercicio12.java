import java.util.Scanner;
public class exercicio12 {
    public static void main(String[]arg){

        Scanner e=new Scanner(System.in);

        System.out.println("digite um numeor");

        int num=e.nextInt();

        double quadrado= Math.pow(num,2);
        double cubo= Math.pow(num,3);
        double raiz= Math.sqrt(num);
        double potencia10= Math.pow(num,10);

        System.out.printf("o seu numero elevado ao quadrado é %.2f\n seu numero ao cubo %.2f\n seu numero na raiz quadrada %.2f\n Seu numero elevado a 10 %.2f\n",quadrado,cubo,raiz,potencia10);
    }
}
