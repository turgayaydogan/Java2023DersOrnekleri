public class d5 {
    public static void main(String[] args) {
        String str = new String("SDUCeng");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println("Turgay".length());

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));

        System.out.println(str.substring(3));//Index numarası 3 den itibaren sona kadar al
        System.out.println(str.substring(0, 3));//Index numarası 0 dan Index numrası 3 e kadar al, substring(başlangıçIndex,bitişIndex)
    }
}
