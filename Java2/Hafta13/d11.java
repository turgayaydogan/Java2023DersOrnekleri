import java.io.File;

public class d11 {
    public static void main(String[] args) {
        File file = new File("d:\\Javaokul\\deneme\\ogrenciler.txt");

        boolean sonuc = file.delete();

        if (sonuc == true)
            System.out.println("Silindi..");
        else
            System.out.println("Silinemedi");

    }
}
