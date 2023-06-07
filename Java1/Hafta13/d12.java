import java.io.File;

public class d12 {
    public static void main(String[] args) {
        File file = new File("d:\\JavaOkul");
        String[] liste1 = file.list();
        for (String string : liste1) {
            System.out.println(string);
        }

    }
}
