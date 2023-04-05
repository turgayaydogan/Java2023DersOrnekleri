public class d7 {
    public static void main(String[] args) {
        int enAz = 5;
        int enCok = 8;
        int tutulanSayi;

        // enAz.....enCok arasında rastgele bir tam sayı tutmak için
        tutulanSayi = enAz + ((int) (Math.random() * (enCok-enAz+1))); 
        System.out.println(tutulanSayi);

    }
}
