import java.util.Scanner;

public class d8 {
    public static void main(String[] args) {
        int not1,not2,ort;

        Scanner giris=new Scanner(System.in);


        System.out.println("1.Notu Gir:");
        not1 = giris.nextInt();

        System.out.println("2.Notu Gir:");
        not2 = giris.nextInt();

        ort = (not1 + not2) / 2;

        System.out.println("Ortalama=" + ort);
    }
}
