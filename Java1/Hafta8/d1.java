public class d1 {

    public static void main(String[] args) {
        int[] sayilar1={1,3,5,7,9};

        int[] sayilar2 = sayilar1;//==> int[] sayilar2 = {1,3,5,7,9}  TAM OLARAK buna denk değildir.DİKKAT  

        System.out.println(sayilar1[0]);
        System.out.println(sayilar2[0]);

        //DEĞER DEĞİŞTİRDİK sayilar2 dizisinin ilk elemanında değeri değişti**********
        sayilar1[0]=10;

        System.out.println(sayilar1[0]);
        System.out.println(sayilar2[0]);

    }
}