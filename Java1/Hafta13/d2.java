import java.io.File;
import java.io.IOException;

public class d2 {
    public static void main(String[] args) throws IOException {
        File dosya = new File("d:\\okul\\okul\\ogrenciler.txt");

        dosya.createNewFile();

        System.out.println("işlem başarılı ogrenciler.txt oluşturuldu.");
    }
}
