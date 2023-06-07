import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class d17 {
    public static void main(String[] args) throws IOException {
        String dosyaAdi = "D:\\javaokul\\deneme\\ogrenciler.txt";
/* 
        FileReader fr = new FileReader(dosyaAdi);
        int sonuc = fr.read();
        while (sonuc != -1) {
            System.out.print((char) sonuc);
            sonuc = fr.read();
        }
        fr.close();
*/
        FileReader fr = new FileReader(dosyaAdi);
        int sonuc;
        while ((sonuc = fr.read()) != -1)
            System.out.print((char) sonuc);
        fr.close();// okumak için açılan dosyalar kapatılmaz ise hata verebilir

    }
}
