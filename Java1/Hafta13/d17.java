
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;

import java.util.List;

public class d17 {
    public static void main(String[] args) {
        try {
            String dosyaAdi = "D:\\JavaOkul\\Deneme\\ogrenciler.txt";

            Path filePath = new File(dosyaAdi).toPath();
            List<String> stringList = Files.readAllLines(filePath,Charset.defaultCharset());
            for (String satir : stringList) {
                System.out.println(satir);
            }

           
            

        } catch (IOException ee) {
            ee.printStackTrace();
        }

    }
}
