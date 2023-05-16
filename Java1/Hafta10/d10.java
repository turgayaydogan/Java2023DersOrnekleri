public class d10 {
    public static void main(String[] args) {
        int[] sayilar = {1,3,5,7,9};

        
        for (int i = 0; i < sayilar.length; i++) {
            int sayi = sayilar[i];
            sayi++;
            System.out.println(sayi);
        }
        System.out.println("********");
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
    }
}
