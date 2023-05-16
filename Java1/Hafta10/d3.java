public class d3 {
    public static void main(String[] args) {
        System.out.println(dortIslem(10, 20, '+'));
        System.out.println(dortIslem(10, 20, '-'));
        System.out.println(dortIslem(10, 20, '*'));
        System.out.println(dortIslem(10, 20, '/'));
    }

    static int dortIslem(int sayi1, int sayi2, char islem) {
        int sonuc = 0;
        /*
         * işlemler
         */

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '/':
                sonuc = sayi1 / sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;

            default:
                sonuc = 0;
                break;
        }

        return sonuc;

    }

    static double dortIslem2(int sayi1, int sayi2, char islem) {
        double sonuc=0;
        /*
        * ????????
        */
        return sonuc;
    }

}
