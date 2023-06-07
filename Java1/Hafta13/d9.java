import java.io.File;

public class d9 {
    public static void main(String[] args) {
        File file = new File("d:\\JavaOkul\\Deneme\\ogrenciBilgileri.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("Silindi..");
        }

    }
}
