import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class d18 {
    public static void main(String[] args) throws Exception {
        String dosyaAdi = "D:\\javaokul\\deneme\\ogrenciler.txt";

        FileReader fr = new FileReader(dosyaAdi);

        BufferedReader oku = new BufferedReader(fr);
        String satir = oku.readLine();
        while (satir != null) {
            System.out.println(satir);
            satir = oku.readLine();
        }
        oku.close();

    }
}
