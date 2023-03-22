import java.util.Scanner;

public class d19 {
    public static void main(String[] args) {
      /*
       *   2.	Bir öğrencinin klavyeden girilen 100 lük notunu harfe çeviren bir program yazılması istenilmektedir. 
       * Aşağıdaki kurallara göre harf notu ekrana yazdırılmak istenmektedir,
            a.	0<=notu<25  F
            b.	25<=notu<45  E
            c.	45<=notu<55  D
            d.	55<=notu<70  C
            e.	70<=notu<85  B
            f.	85<=notu<=100  A
       */

        int ogrNot;
        Scanner giris=new Scanner(System.in);

        System.out.println("Not Giriniz:");
        ogrNot = giris.nextInt();

        if(0<=ogrNot && ogrNot<25){
            System.out.println("F");
        }

        if(25<=ogrNot && ogrNot<45){
            System.out.println("E");
        }

        if(45<=ogrNot && ogrNot<55){
            System.out.println("D");
        }

        if(55<=ogrNot && ogrNot<70){
            System.out.println("C");
        }

        if(70<=ogrNot && ogrNot<85){
            System.out.println("B");
        }

        if(85<=ogrNot && ogrNot<=100){
            System.out.println("A");
        }


    }
}
