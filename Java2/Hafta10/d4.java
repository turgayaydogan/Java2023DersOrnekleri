import java.util.Arrays;

public class d4 {
    public static void main(String[] args) {
        int[] sayilar1 = {1,3,5,7,9};

        int[] sayilar2 = diziKopyala(sayilar1);


        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));

    }

    static int[] diziKopyala(int[] gelenDizi){
        return gelenDizi.clone();
    }
}
