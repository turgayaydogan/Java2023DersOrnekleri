import java.util.Scanner;

public class d5 {
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
            if (tututalSayi < tahmin)
                System.out.println("Aşağı");
            if(tututalSayi==tahmin)
                System.out.println("Tebrikler");

        } while (tututalSayi!=tahmin); // !(tutulanSayi==tahmin)

    }
}
