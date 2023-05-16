import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        int sayi1=10,sayi2=20,sayi3=50;

        System.out.println(ucSayiyiTopla_1(sayi1, sayi2, sayi3));// ==> parametre sayi1 = sayi1,parametre sayi2=sayi2, parametre sayi3=sayi3
        System.out.println(ucSayiyiTopla_1(sayi3, sayi1, sayi2));// ==> parametre sayi1 = sayi3,parametre sayi2=sayi1, parametre sayi3=sayi2


        int a,b,c;
        Scanner giris=new Scanner(System.in);
        System.out.print("Sayı Gir:");
        a = giris.nextInt();

        System.out.print("Sayı Gir:");
        b = giris.nextInt();

        System.out.print("Sayı Gir:");
        c = giris.nextInt();

        System.out.println(ucSayiyiTopla_1(a,b,c));// ==> parametre sayi1 = a,parametre sayi2=b, parametre sayi3=c
    }

    static int ucSayiyiTopla_1(int sayi1, int sayi2,int sayi3) {
        int toplam;
        toplam = sayi1 + sayi2 + sayi3;
        return toplam;
    }

    static int ucSayiyiTopla_2(int sayi1, int sayi2,int sayi3) {
        int toplam = sayi1 + sayi2 + sayi3;
        return toplam;
    }

    static int ucSayiyiTopla_3(int sayi1, int sayi2,int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }
}
