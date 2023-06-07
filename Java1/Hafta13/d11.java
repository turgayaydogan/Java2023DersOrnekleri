import java.io.File;

public class d11 {
    public static void main(String[] args) {
        File file = new File("d:\\JavaOkul\\ogrenciNotlari.txt");
        System.out.println("file.getAbsolutePath():\t"+file.getAbsolutePath());
        System.out.println("file.getPath():\t\t"+file.getPath());
        System.out.println("file.getParent():\t"+file.getParent());
        System.out.println("file.getName():\t\t"+file.getName());

    }
}
