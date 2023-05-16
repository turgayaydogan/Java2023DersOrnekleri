public class d6 {
    public static void main(String[] args) {
        topla1(20,10);
        topla2(20.0,10);
        topla3(20,10,20.5);
        topla4(15.5,10,20);
    }
    
    static void topla1(int sayi1,int sayi2){
        System.out.println(sayi1+sayi2);
    }

    static void topla2(double sayi1,double sayi2){
        System.out.println(sayi1+sayi2);
    }

    static void topla3(int sayi1,int sayi2,double sayi3){
        System.out.println(sayi1+sayi2+sayi3);
    }

    static void topla4(double sayi1,double sayi2,int sayi3){
        System.out.println(sayi1+sayi2+sayi3);
    }
}
