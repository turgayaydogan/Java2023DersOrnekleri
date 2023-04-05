public class d17 {
    public static void main(String[] args) {
        // 6. 1-5 arasındaki sayıları çarpan program,
        // 5*4*3*2*1
        int sonuc = 1;

        for (int i =5; i>=1; i--) {
            sonuc = sonuc * i;
        }
        System.out.println(sonuc);
    }
}
