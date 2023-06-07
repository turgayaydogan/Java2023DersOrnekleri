import java.io.File;
import java.io.IOException;

public class d2 {
    public static void main(String[] args) throws IOException {
        File dosya = new File("d:\\javaokul\\ornekler\\ogrenciler.txt");

        dosya.createNewFile();
    }
}
