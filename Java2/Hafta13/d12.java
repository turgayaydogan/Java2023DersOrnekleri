import java.io.File;

public class d12 {
    public static void main(String[] args) {
        File file = new File("d:\\Javaokul\\deneme\\Yeni Klasör");

        boolean sonuc = file.delete();

        if (sonuc == true)// if (sonuc)
            System.out.println("Silindi..");
        else
            System.out.println("Silinemedi");
    }
}
