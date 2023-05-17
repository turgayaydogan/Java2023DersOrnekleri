public class d19 {
    public static void main(String[] args) {

        int[] sayilar = { 1, 3, 5, 7 };

        System.out.println("Ekrana Yazdırma 1");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

        try {
            System.out.println("Ekrana Yazdırma 2");
            for (int i = 0; i < 10; i++) {
                System.out.println(sayilar[i]);
            }
        } catch (Exception e) {
            System.out.println("Hata Oluştu");
        }

    }
}
