import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class d16 {
    public static void main(String[] args) throws IOException {
        String dosyaAdi = "D:\\JavaOkul\\Deneme\\ogrenciler.txt";
        FileReader fr = new FileReader(dosyaAdi);
        BufferedReader oku = new BufferedReader(fr);
        //BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
        String satir = oku.readLine();
        while (satir != null) {
            System.out.println(satir);
            satir = oku.readLine();
        }
        oku.close();

    }
}
