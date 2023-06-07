import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class dosyaOkumaYazma_6 {
    // vize notu 50-60 arasında olanları 70 yap
    // dosyaya da bu değerleri değiştir

    public static void main(String[] args) {
        try {
            String dosyaAdi = "D:\\JavaOkul\\RastgeleVeri.txt";

            Path filePath = new File(dosyaAdi).toPath();
            List<String> stringList = Files.readAllLines(filePath, Charset.defaultCharset());
            for (int i = 0; i < stringList.size(); i++) {// satır satır okuma işlemi yapılıyor
                String satir = stringList.get(i);

                // herbir öğrencinin ad ve soyad bilgisini yazdır
                String[] satirBilgileri = satir.split(";");// ; e göre parçala
                // satirBilgileri[0] ==> OgrNo
                // satirBilgileri[1] ==> Ad
                // satirBilgileri[2] ==> Soyad
                // satirBilgileri[3] ==> TelNo
                // satirBilgileri[4] ==> Sınıf
                // satirBilgileri[5] ==> Vize
                // satirBilgileri[6] ==> Final
                // satirBilgileri[7] ==> GNO
                // satirBilgileri[8] ==> Cinsiyet
                if ((Integer.parseInt(satirBilgileri[5]) >= 50) && (Integer.parseInt(satirBilgileri[5]) <= 60))
                    System.out.println(satir);

                // vizesi 50-60 arasında olanların bilgileri yeniden oluşturulur
                if ((Integer.parseInt(satirBilgileri[5]) >= 50) && (Integer.parseInt(satirBilgileri[5]) <= 60)) {

                    String yeniOgrenciBilgileri = satirBilgileri[0] + ";" + satirBilgileri[1] + ";" + satirBilgileri[2]
                            + ";" + satirBilgileri[3] + ";" + satirBilgileri[4] + ";" + "70" + ";" + satirBilgileri[6]
                            + ";" + satirBilgileri[7] + ";" + satirBilgileri[8];
                    System.out.println(satir);
                    System.out.println(yeniOgrenciBilgileri);
                    stringList.set(i, yeniOgrenciBilgileri);// listedeki eski bilgiyi yeni vize ile değiştirir

                }

            }

            // liste txt olarak yeniden yazılır.
            // listenin her bir elemanı satır satır yazdıırlır.
 
            FileWriter fw = new FileWriter(dosyaAdi, false);
            for (int i = 0; i < stringList.size(); i++) {
                fw.write(stringList.get(i) + "\n");
            }           
            fw.close();

        } catch (IOException ee) {
            System.out.println("Hata oluştu");
        }

       

    }
}