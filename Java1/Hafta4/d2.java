public class d2 {
    public static void main(String[] args) {
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1; // 0.5
        if (x == 0.5)
            System.out.println("Eşittir");
        else
            System.out.println("Eşit Değildir");

        System.out.println(x);
        //Kayan noktalı sayıların hesaplamalara dahil edilmesi yuvarlama hatalarına neden olabilir. Bu nedenle, iki kayan noktalı değerin eşitlik testi güvenilir değildir.

    }
}
