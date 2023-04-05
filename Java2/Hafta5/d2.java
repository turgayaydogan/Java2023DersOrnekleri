import java.util.Scanner;

public class d2 {
    public static void main(String[] args) {
        int tutulanSayi, tahmin;
        Scanner giris = new Scanner(System.in);

        tutulanSayi = (int) (Math.random() * 100);
        System.out.println("Bir sayı tuttum haydi bil bakalım :)");

        do {
            System.out.print("Tahmin: ");
            tahmin = giris.nextInt();

            if (tutulanSayi > tahmin)
                System.out.println("Yukarı");
            if (tutulanSayi < tahmin)
                System.out.println("Aşağı");
            if (tutulanSayi == tahmin)
                System.out.println("Tebrikler");

        } while (tutulanSayi!=tahmin); // !(tutulanSayi==tahmin)

    }
}
