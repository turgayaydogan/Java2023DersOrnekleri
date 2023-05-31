import java.io.File;

public class d15 {
    public static void main(String[] args) {
        try {
            File dosya = new File("h:\\ogrenciler.txt");
            dosya.createNewFile();
        } catch (Exception e) {
            System.out.println("Bir hata oluştu, lütfen tekrar deneyiniz");
        }
    }
}
