import java.io.IOException;

public class d1 {

    static int[] sayilar3 = { 1, 3, 5, 7, 9 };

    public static void main(String[] args) throws IOException {
        int[] sayilar = { 1, 3, 5, 7, 9 };

        sayilar3[1] = 12;

        for (int i : sayilar) {
            System.out.println(i);
        }

        try {
            Runtime.getRuntime().exec("cls");
        } catch (Exception e) {
            // TODO: handle exception
        }

        try {

            ProcessBuilder pB = new ProcessBuilder("cmd", "/c", "cls");
            pB.inheritIO().start().waitFor();

        } catch (Exception e) {
            System.out.println("Hata");
        }

        int[] sayilar2 = { 1, 3, 5, 7, 9 };

        for (int i : sayilar2) {
            System.out.println(i);
        }

    }
}