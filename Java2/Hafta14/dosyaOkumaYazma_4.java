import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;

import java.util.List;

public class dosyaOkumaYazma_4 {

    public static void main(String[] args) {
        try {
            String dosyaAdi = "D:\\JavaOkul\\RastgeleVeri.txt";

            Path filePath = new File(dosyaAdi).toPath();
            List<String> stringList = Files.readAllLines(filePath, Charset.defaultCharset());
            for (String satir : stringList) {// satır satır okuma işlemi yapılıyor
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
                if (Double.parseDouble(satirBilgileri[7].replace(',','.')) > 1.8) {

                    double ort = Integer.parseInt(satirBilgileri[5]) * 0.4 + Integer.parseInt(satirBilgileri[6]) * 0.6;
                    System.out.println(
                            "Vize: " + satirBilgileri[5] + ", Final: " + satirBilgileri[6] + " = Ortalama: " + ort);
                }
                // System.out.println(satir);
            }

        } catch (IOException ee) {
            System.out.println("Hata oluştu");
        }

    }
}