import java.io.File;

public class d13 {
    public static void main(String[] args) {
        File file = new File("d:\\javaokul\\deneme\\ogrenciler.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getName());

    }
}
