import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;

import java.util.List;
public class dosyaOkumaYazma_1 {

    public static void main(String[] args) {
        try {
            String dosyaAdi = "D:\\JavaOkul\\RastgeleVeri.txt";

            Path filePath = new File(dosyaAdi).toPath();
            List<String> stringList = Files.readAllLines(filePath,Charset.defaultCharset());
            for (String satir : stringList) {//satır satır okuma işlemi yapılıyor
                //herbir öğrencinin ad ve soyad bilgisini yazdır
                String[] satirBilgileri = satir.split(";");//; e göre parçala
                //satirBilgileri[0] ==> Sırano
                //satirBilgileri[1] ==> Ad
                //satirBilgileri[2] ==> Soyad
                //satirBilgileri[3] ==> TelNo
                //satirBilgileri[4] ==> Sınıf
                //satirBilgileri[5] ==> Vize
                //satirBilgileri[6] ==> Final
                //satirBilgileri[7] ==> GNO
                //satirBilgileri[8] ==> Cinsiyet

                System.out.println(satirBilgileri[1]+" "+satirBilgileri[2]);




                System.out.println(satir);
            }


        } catch (IOException ee) {
            System.out.println("Hata oluştu");
        }

    }
}