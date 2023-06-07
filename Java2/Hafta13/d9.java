import java.io.File;

public class d9 {

    public static void main(String[] args) {

        File file = new File("d:\\Javaokul\\deneme\\Yeni Klasör");
        if (!file.exists())
            file.mkdir();

    }
}
