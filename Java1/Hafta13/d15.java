import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class d15 {
    public static void main(String[] args) throws IOException {
        String dosyaAdi = "D:\\JavaOkul\\Deneme\\ogrenciler.txt";
        FileReader fr = new FileReader(dosyaAdi);
        int sonuc = fr.read();
        while (sonuc != -1) {//okunan değer -1 den farklı ise okunabilen karakter var demek
            System.out.print((char) sonuc);//okunan karakteri ASCII olarak okudu, char a dönüştürdü
            sonuc = fr.read();//sonraki karakteri okumaya çalıştı
        }
        fr.close();//okumak için açılan dosya kapatılmalıdır. Kapatılmaz ise hata verebilir.

    }
}
