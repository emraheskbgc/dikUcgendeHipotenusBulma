import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b ;
        System.out.println("1. kenarı giriniz :");
        a=input.nextInt();
        System.out.println("2. kenarı giriniz");
        b=input.nextInt();

        double c;
        c=Math.sqrt((a*a) + (b*b));
        System.out.print("Üçgenin hipotenüsü = " + c);


    }
}
