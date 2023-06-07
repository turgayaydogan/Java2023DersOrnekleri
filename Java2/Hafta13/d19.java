import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class d19 {
    public static void main(String[] args)  throws Exception {
        String dosyaAdi = "D:\\javaokul\\deneme\\ogrenciler.txt";

        BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
        String satir;
        while ((satir=oku.readLine()) != null) {
            System.out.println(satir);
           
        }
        oku.close();
    }
}
