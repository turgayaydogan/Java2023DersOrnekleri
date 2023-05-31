import java.io.File;

public class d18 {
    public static void main(String[] args) {
        try {
            File dosya = new File("h:\\ogrenciler.txt");
            dosya.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Bir hata oluştu");
        }
    }
}
