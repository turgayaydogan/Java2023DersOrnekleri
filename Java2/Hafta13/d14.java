import java.io.File;

public class d14 {

    public static void main(String[] args) {

        File file = new File("d:\\javaokul");
        String[] liste1 = file.list();
        for (String string : liste1) {
            System.out.println(string);
        }

        System.out.println("**********************");

        File[] dosyalar = file.listFiles();

        for (File file1 : dosyalar) {
            System.out.println(file1.getName());
        }

        System.out.println("**********************");

        File[] dosyalar2 = file.listFiles();

        for (File file1 : dosyalar2) {
            System.out.println(file1.getName() + " " + file1.getPath());
        }

    }
}
