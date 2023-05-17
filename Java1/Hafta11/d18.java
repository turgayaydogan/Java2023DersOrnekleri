public class d18 {
    public static void main(String[] args) {
            String tersString = tersle("Merhaba");
            System.out.println("Merhaba");
            System.out.println(tersString);


            String str1="Isparta";
            tersString = tersle(str1);
            System.out.println(tersString);


            System.out.println(tersle(str1));
    }

    static String tersle(String gelenString){
        String sonuc="";
        for(int i=gelenString.length()-1;i>=0;i--){
            sonuc += gelenString.charAt(i);
        }

        return sonuc;
    }

    // bir metota parametre olarak yollana String terslenip geri döndürülecektir.
}
