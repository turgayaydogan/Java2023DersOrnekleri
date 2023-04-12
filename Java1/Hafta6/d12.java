public class d12 {
    public static void main(String[] args) {
        int k = 0;
        for (; 1 < 2; k++)
            System.out.println("A");

        System.out.println("B"); // şarta göre döngü hep tekrarlayacaktır, sonsuz döngü olacaktır. 7.satıra
                                 // çalışma sırası hiç gelmez.
    }
}
