public class d1 {
    public static void main(String[] args) {
        int a, b, c;
        a = (int) (Math.random() * 10);// 0.0-0.1
        System.out.println(a);

        double tutulanSayi = Math.random();
        System.out.println("Tutulan Sayı:" + tutulanSayi);

        tutulanSayi = tutulanSayi * 10;
        System.out.println("Tutulan Sayı:" + tutulanSayi);

        a = (int) tutulanSayi;
        System.out.println(a);

        System.out.println("Aralıklı Sayı Tutma");
        int enAz = 5;
        int enCok = 8;

        // enAz.....enCok arasında rastgele bir tam sayı tutmak için
        tutulanSayi = Math.random();
        System.out.println(tutulanSayi);
        tutulanSayi = tutulanSayi * (enCok - enAz + 1);
        System.out.println(tutulanSayi);
        a = (int) tutulanSayi;
        System.out.println(a);
        a = enAz + a;
        System.out.println(a);

    }
}