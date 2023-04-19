public class d4 {
    public static void main(String[] args) {
        int[] dizi1, dizi2, dizi3;// dizilerin eleman sayısı bellimi?, eleman sayısı belli olmadığı için bu
                                  // dizilerin elemanlarına ulaşamayız.

        dizi1 = new int[5]; // new anahtar kelimesi ile dizi tanımlandığında dizinin veritipine uygun olarak
                            // elemanlara başlangıç değeri ataması yapılır
        System.out.println(dizi1[0]);

        dizi1[0] = 5;

        int sayi;

        sayi = dizi1[0]+10;

        dizi1[0]++;     //değişkenlerde yapılan hertürlü işlem ve kullanım dizinin herbir elemanı için geçerlidir.

        System.out.println(dizi1[0]);

    }
}
