import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        /*
        * N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
        * n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        * C(n,r) = n! / (r! * (n-r)!)
        */

        int n;
        int r;

        int nFaktoriyel = 1;
        int rFaktoriyel = 1;
        int eksiFaktoriyel = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısı giriniz: ");
        n = input.nextInt();
        System.out.print("Grup sayısı giriniz: ");
        r = input.nextInt();

        for(int i = 1; i <=n ; i++) {
            nFaktoriyel *=i;
        }
        for(int k = 1; k <=r; k++){
            rFaktoriyel *=k;
        }
        int fark = n-r;
        for(int j = 1; j<=fark; j++ ){
            eksiFaktoriyel *=j;
        }

        int kombinasyon;
        kombinasyon = ((nFaktoriyel) / ((rFaktoriyel) * (eksiFaktoriyel)));
        System.out.print("C(n,r) : " + kombinasyon );


    }
}
