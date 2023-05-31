public class d8 {
    public static void main(String[] args) {
        //DİKKAT: 10.satırda olmayan bir elemana ulaşılmaya çalışılıyor ve bu hata ortaya çıkarır.
        //fakat try-catch ArithmeticException ile ilgili hataları yakalamak için yazılmış
        //bundan dolayı maalesef kodlar isteğimiz dışında sonlanır ve çalışma zamanında hata verir
        try {
            int[] sayilar = {10,20,30,40,50};
            System.out.println(sayilar[0]);
            System.out.println(sayilar[4]);
            System.out.println(sayilar[5]);//index numarası ile ilgili bir hata ortaya çıkarır
        } catch (ArithmeticException e) {//Aritmatik işlem ile ilgili hata sıfıra bölüm hatası meydana geldiğinde çalışır
            System.out.println("Bir hata oluştu, lütfen tekrar deneyiniz. :(");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        finally{
            System.out.println("Program sonlandı...");
        }
    }
}
