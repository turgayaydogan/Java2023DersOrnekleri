import java.util.Scanner;

public class d17 {
    public static void main(String[] args) {
        int ogrNot;
        Scanner giris = new Scanner(System.in);

        System.out.println("0-100 Arasında bir not giriniz:");
        ogrNot = giris.nextInt();

        if (0 <= ogrNot && ogrNot < 25) { // 0<=20 ve 20<25 ==> 1/true ve 1/true=true
            System.out.println("F");
        }
        else if (25 <= ogrNot && ogrNot < 45) { // 25<=20 ve 20<45 == > 0/false ve 1/true = 0/false
            System.out.println("E");
        }
        else if (45 <= ogrNot && ogrNot < 55) {
            System.out.println("D");
        }
        else if (55 <= ogrNot && ogrNot < 70) {
            System.out.println("C");
        }
        else if (70 <= ogrNot && ogrNot < 85) {
            System.out.println("B");
        }
        else if (85 <= ogrNot && ogrNot <= 100) {
            System.out.println("A");
        }
        //if dışı
    }
}
