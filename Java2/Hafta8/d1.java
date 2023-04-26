/**
 * d1
 */
public class d1 {

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = sayi1;

        sayi1 = 20;
        System.out.println(sayi1);
        System.out.println(sayi2);

        int[] sayilar1 = {1,3,5,7};
        int[] sayilar2 = sayilar1;

        sayilar1[0] = 100;

        System.out.println(sayilar1[0]);
        System.out.println(sayilar1[1]);

        System.out.println(sayilar2[0]);
        System.out.println(sayilar2[1]);

    }
}