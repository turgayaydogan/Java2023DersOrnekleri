public class d8 {
    public static void main(String[] args) {
        // 1 den 1000 e kadar 5’in katı olup 2 nin katı olmayan sayıların ekrana
        // yazdıran
        // programı yazınız.

        int kalan1, kalan2;
        int adet = 0;

        for (int i = 1; i <= 1000; i++) {
            kalan1 = i % 5; // 0-1-2-3-4
            kalan2 = i % 2; // 0-1

            if (kalan1 == 0 && kalan2 != 0)// kalan2==1
                System.out.println(i);
        }
        System.out.println("************");
        // 1 den 1000 e kadar 5’in katı olup 2 nin katı olmayan sayıların adetini bulup
        // ekrana yazdıran
        // programı yazınız.

        for (int i = 1; i <= 1000; i++) {
            kalan1 = i % 5; // 0-1-2-3-4
            kalan2 = i % 2; // 0-1

            if (kalan1 == 0 && kalan2 != 0)// kalan2==1
                adet++;
        }
        System.out.println(adet);
    }
}
