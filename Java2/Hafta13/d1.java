import java.io.File;

/**
 * d1
 */
public class d1 {

    public static void main(String[] args) {
        try {
            File dosya = new File("d:\\javaokul\\ornekler\\ogrenciler.txt");

            dosya.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("hata oluştu, lütfen tekrar deneyiniz");
            //e.printStackTrace();
        }
    }
}