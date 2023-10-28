import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // N! = 1*2*3*4*5*...*n

        int sayi;
        int faktoriyel = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        for(int i = 1; i <=sayi ; i++) {
            faktoriyel *=i;
        }
        System.out.print(faktoriyel);

    }
}
