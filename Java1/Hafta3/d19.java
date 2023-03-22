import java.util.Scanner;

public class d19 {
    public static void main(String[] args) {
        int ogrNot;
        Scanner giris = new Scanner(System.in);

        System.out.println("0-100 Arasında bir not giriniz:");
        ogrNot = giris.nextInt();

        if (ogrNot < 25)  // 0<=20 ve 20<25 ==> 1/true ve 1/true=true
            System.out.println("F");
        else if (ogrNot < 45)  // 25<=20 ve 20<45 == > 0/false ve 1/true = 0/false
            System.out.println("E");
        else if (ogrNot < 55) 
            System.out.println("D");
        else if (ogrNot < 70) 
            System.out.println("C");
        else if (ogrNot < 85) 
            System.out.println("B");
        else if (ogrNot <= 100) 
            System.out.println("A");
        //if dışı
    }
}
