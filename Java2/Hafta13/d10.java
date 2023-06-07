import java.io.File;

public class d10 {
    
    public static void main(String[] args) {
        File file = new File("d:\\Javaokul\\deneme\\Yeni Klasör1");
        boolean sonuc = file.mkdir();
        System.out.println(sonuc);
    }
}
