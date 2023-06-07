import java.io.File;

public class d15 {
    public static void main(String[] args) {
        File file = new File("d:\\javaokul");
        File[] dosyalar = file.listFiles();

        for (File file1 : dosyalar) {
            if (file1.isFile())
                System.out.println(file1.getName() + " bu bir dosyadır");
            else
                System.out.println(file1.getName() + " bu bir klasör");

        }
    }
}
