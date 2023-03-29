import java.util.Scanner;

public class d7 {
    public static void main(String[] args) {
        int a, b, c;

        int dis;

        double x1, x2;

        Scanner giris = new Scanner(System.in);

        System.out.println("A kat sayısını gir:");
        a = giris.nextInt();

        System.out.println("B katsayını gir:");
        b = giris.nextInt();

        System.out.println("C katsayısnı gir:");
        c = giris.nextInt();

        // dis hesaplama
        dis = b * b - 4 * a * c;
        System.out.println("DIS=" + dis);

        if (dis > 0) {

            x1 = (-b + Math.sqrt(dis)) / (2 * a);
            x2 = (-b - Math.sqrt(dis)) / (2 * a);

            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);

        } else if (dis == 0) {

            x1 = -b / (2 * a);

            System.out.println("x=" + x1);
        }

        else
            System.out.println("reel kök yoktur");
    }
}
