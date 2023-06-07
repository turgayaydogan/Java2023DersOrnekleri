import java.io.File;

public class d10 {
    public static void main(String[] args) {
        File file = new File("d:\\JavaOkul\\Deneme\\Yeni klasör");
        if (file.exists()) {
            boolean sonuc = file.delete();
            System.out.println(sonuc);
            if (sonuc)              // if(sonuc==true)
                System.out.println("Silindi..");
        }

    }
}
