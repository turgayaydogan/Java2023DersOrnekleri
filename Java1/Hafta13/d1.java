import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale.IsoCountryCode;

public class d1 {

    public static void main(String[] args) {
        try {
            File dosya = new File("d:\\okul\\okul\\ogrenciler.txt");

            dosya.createNewFile();

            System.out.println("işlem başarılı ogrenciler.txt oluşturuldu.");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Dosya oluşturulurken bir hata oluştu, lütfen tekrar deneyiniz.");
            //e.printStackTrace();
        }

    }
}