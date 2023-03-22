import java.util.Scanner;

public class d20 {
    public static void main(String[] args) {
        int ogrNot;
        Scanner giris = new Scanner(System.in);

        System.out.println("Not Giriniz:");
        ogrNot = giris.nextInt();

        if (0 <= ogrNot && ogrNot < 25) { // 20 0<=20 ve 20<=25 true ve true = true
            System.out.println("F");
        } else if (25 <= ogrNot && ogrNot < 45) { // 20 25<=20 ve 20<45 false ve true = false
            System.out.println("E");
        } else if (45 <= ogrNot && ogrNot < 55) {
            System.out.println("D");
        } else if (55 <= ogrNot && ogrNot < 70) {
            System.out.println("C");
        } else if (70 <= ogrNot && ogrNot < 85) {
            System.out.println("B");
        } else if (85 <= ogrNot && ogrNot <= 100) {
            System.out.println("A");
        }
        // if dışı
    }
}
