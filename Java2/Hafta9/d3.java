import java.util.Scanner;

public class d3 {
    
    public static void main(String[] args) {
        
        int toplam = ikiSayiyiTopla(10, 20);//sayi1=10, sayi2=20 ==> int toplam = 30;
        System.out.println(toplam); 
        
        double sonuc = Math.sqrt(25);
        System.out.println(sonuc);

        System.out.println(ikiSayiyiTopla(100, 20));


        int t = 50 + ikiSayiyiTopla(500,60);// ==> int t = 50 + 560;
        System.out.println(t);


        int a,b;
        Scanner giris = new Scanner(System.in);
        System.out.println("1.Sayı:");
        a = giris.nextInt();

        System.out.println("2.Sayı:");
        b = giris.nextInt();

        System.out.println(ikiSayiyiTopla(a, b));

    }

    static int ikiSayiyiTopla(int sayi1, int sayi2){
        int toplam = sayi1+sayi2;
        return toplam;
    }
}
