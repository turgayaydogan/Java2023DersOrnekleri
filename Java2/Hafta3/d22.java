import java.util.Scanner;

public class d22 {
    public static void main(String[] args) {
        int ogrNot;
        Scanner giris = new Scanner(System.in);

        System.out.println("Not Giriniz:");
        ogrNot = giris.nextInt();

        if (ogrNot < 25)
            System.out.println("F");
        else if (ogrNot < 45)
            System.out.println("E");
        else if (ogrNot < 55)
            System.out.println("D");
        else if (ogrNot < 70)
            System.out.println("C");
        else if (ogrNot < 85)
            System.out.println("B");
        else
            System.out.println("A");

        // if dışı
    }
}
