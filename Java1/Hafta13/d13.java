import java.io.File;

public class d13 {
    public static void main(String[] args) {

        File file = new File("d:\\JavaOkul");
        File[] dosyalar = file.listFiles();

        for (File file1 : dosyalar) {
            System.out.println(file1.getName());
        }

        System.out.println("***************");

        for (File file1 : dosyalar) {
            System.out.println(file1.getName() + " " + file1.getPath());
        }

        System.out.println("***************");
        System.out.println();

        for (File file1 : dosyalar) {
            if (file1.isFile())
                System.out.println(file1.getName() + " bu bir dosyadır.");
            else
                System.out.println(file1.getName() + " bu bir klasördür.");

        }

    }
}
