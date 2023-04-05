import java.util.Scanner;

public class d2 {
    public static void main(String[] args) {
        int a, b, c, dis;
        // double x1, x2;

        Scanner giris = new Scanner(System.in);

        System.out.println("A katsayısını Gir:");
        a = giris.nextInt();

        System.out.println("B Katsayısını Gir:");
        b = giris.nextInt();

        System.out.println("C katsayısnı Gir:");
        c = giris.nextInt();

        dis = b * b - 4 * a * c;

        System.out.println("DIS = " + dis);
        // Math içerisinde yer alan metodlar çalıştıklarında double sonuç
        // üretirler,geriye döndürürler

        if (dis > 0) {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println("X1=" + x1);
            System.out.println("X2=" + x2);
        }

        if (dis == 0) {
            double x = -b / (2 * a);
            System.out.println("X=" + x);
        }

        if (dis < 0)
            System.out.println("REEL Kök yoktur.");
    }
}
