public class d12 {
    public static void main(String[] args) {
        // 1 den 1000 e kadar 5’in katı olup 2 nin katı olmayan sayıların ekrana yazan
        // programı yazınız.

        for (int i = 1; i <= 1000; i++) {
            int kalan1 = i % 5;
            int kalan2 = i % 2;
            if (kalan1 == 0 && kalan2 != 0)// kalan1==0 && kalan2==1
                System.out.println(i);
        }

        // 1 den 1000 e kadar 5’in katı olup 2 nin katı olmayan sayıların adetini bulan
        // programı yazınız.

        int adet = 0;
        for (int i = 1; i <= 1000; i++) {            
            int kalan1 = i % 5;
            int kalan2 = i % 2;
            if (kalan1 == 0 && kalan2 != 0)// kalan1==0 && kalan2==1
                adet++;
        }
        System.out.println("Adet Değeri="+adet);

    }
}
