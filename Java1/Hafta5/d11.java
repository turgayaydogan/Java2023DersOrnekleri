public class d11 {
    public static void main(String[] args) {
        // 1-1000 arasındaki sayıların toplamı

        int toplam = 0;

        for (int i = 1; i <= 1000; i++) {
            toplam = toplam + i;

        }
        System.out.println(toplam);

        // 1-1000 arasındaki 8'in katı olan sayıların toplamı

        int toplam2 = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 8) == 0)// sıradaki sayı 8 e tam bölünür
                toplam2 += i;
        }
        System.out.println(toplam2);

        // 1-1000 arasındaki 8'in katı olan sayıların toplamı

        int toplam3 = 0;

        for (int i = 1; i <= 1000; i++) {
            int kalan = i % 8;
            if (kalan== 0)// sıradaki sayı 8 e tam bölünür
                toplam3 += i;
        }
        System.out.println(toplam3);

    }
}
