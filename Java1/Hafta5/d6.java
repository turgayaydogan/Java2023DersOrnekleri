import java.util.Scanner;

public class d6 {
    public static void main(String[] args) {
        int tututalSayi, tahmin;

        Scanner giris = new Scanner(System.in);

        tututalSayi = (int) (Math.random() * 100);

        System.out.println("Bir sayı tuttum haydi bil bakalım :)");

        do {
            System.out.print("Tahmin: ");
            tahmin = giris.nextInt();

            if (tututalSayi > tahmin)
                System.out.println("Yukarı");
            else if (tututalSayi < tahmin)
                System.out.println("Aşağı");
            else if(tututalSayi==tahmin)        // if şartı yazılmayabilir
                System.out.println("Tebrikler");

        } while (tututalSayi!=tahmin); // !(tutulanSayi==tahmin)
    }
}
