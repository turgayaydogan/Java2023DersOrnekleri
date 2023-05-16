public class d9 {
    public static void main(String[] args) {
        int[] sayilar1 = {1,3,5,7,9};

        for (int i = 0; i < sayilar1.length; i++) {
            int sayi = sayilar1[i];

        }

        for (int sayi : sayilar1) {
            
        }


        for (int i = 0; i < sayilar1.length; i++) {
            int sayi = sayilar1[i];
            sayi++;
            System.out.println(sayi);
        }

        for (int sayi : sayilar1) {
            System.out.println(sayi);
        }
    }
}
