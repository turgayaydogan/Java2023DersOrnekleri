public class d9 {
    public static void main(String[] args) {
        int[] sayilar = {1,3,5,7,9};

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

        for (int i = 0; i < sayilar.length; i++) {
            int sayi = sayilar[i];
            System.out.println(sayi);
        }

        for (int i = 0; i < sayilar.length; i++) {
            int sayi = sayilar[i];
            System.out.println(sayi);
        }

        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
    }
}
