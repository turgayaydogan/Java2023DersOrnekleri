public class d6 {
    public static void main(String[] args) {
        try {
            int[] sayilar = {10,20,30,40,50};
            System.out.println(sayilar[0]);
            System.out.println(sayilar[4]);
            
        } catch (Exception e) {// her hangi bir hata meydana geldiğinde çalışır
            System.out.println("Bir hata oluştu, lütfen tekrar deneyiniz. :(");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        finally{
            System.out.println("Program sonlandı...");
        }
    }
}
