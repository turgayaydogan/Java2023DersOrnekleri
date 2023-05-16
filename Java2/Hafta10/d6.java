public class d6 {
    public static void main(String[] args) {
        topla(10,20);
        topla(10.0,20.0);
        topla(10, 20, 30);
        topla(10.0, 20.0, 30);

        topla(10,20.0,30);
    }

    static void topla(int sayi1, int sayi2){
        System.out.println(sayi1+sayi2);
    }

    static void topla(double sayi1, double sayi2){
        System.out.println(sayi1+sayi2);
    }

    static void topla(int sayi1, int sayi2, int sayi3){
        System.out.println(sayi1+sayi2+sayi3);
    }

    static void topla(double sayi1, double sayi2, int sayi3){
        System.out.println(sayi1+sayi2+sayi3);
    }

}
