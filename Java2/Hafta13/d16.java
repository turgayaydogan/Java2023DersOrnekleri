import java.io.FileWriter;
import java.io.IOException;

/**
 * d16
 */
public class d16 {

    public static void main(String[] args) throws IOException {
        String dosyaAdi = "D:\\javaokul\\deneme\\ogrenciler.txt";
        FileWriter fw = new FileWriter(dosyaAdi, true);
        fw.write("Ali" + "\n");
        fw.write("Ahmet" + "\n");
        fw.write("Ayşe" + "\n");
        fw.write("Elif" + "\n");
        fw.close();// yazmak için açılan dosyalar kapatılmaz ise hata verebilir

    }
}