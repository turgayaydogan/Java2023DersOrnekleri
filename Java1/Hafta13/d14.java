import java.io.FileWriter;
import java.io.IOException;

public class d14 {

    public static void main(String[] args) throws IOException  {
        String dosyaAdi = "D:\\JavaOkul\\Deneme\\ogrenciler.txt";
        FileWriter fw = new FileWriter(dosyaAdi, true);
        fw.write("Ali" + "\n");
        fw.write("Ahmet" + "\n");
        fw.write("Ayşe" + "\n");
        fw.write("Elif" + "\n");
        fw.close();//yazmak için açılan dosya kapatılmalıdır. Kapatılmaz ise hata verebilir.

    }
}
