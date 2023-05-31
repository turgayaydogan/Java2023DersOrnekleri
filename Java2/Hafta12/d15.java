import java.io.File;

public class d15 {
    public static void main(String[] args) {
        try {
            File dosya= new File("ogrenciler.txt");
            dosya.createNewFile(); 
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
