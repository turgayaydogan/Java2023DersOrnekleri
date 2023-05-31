public class d3 {
    public static void main(String[] args) {
        int[] sayilar = {10,20,30,40,50};

        try {
            System.out.println(sayilar[0]);
            System.out.println(sayilar[4]);
            System.out.println(sayilar[5]);
        } catch (Exception e) {// her hangi bir hata meydana geldiğinde çalışır
            System.out.println("Bir hata oluştu, lütfen tekrar deneyiniz. :(");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
