public class metotDefault_2 {
    public static void main(String[] args) {
       sayilariTopla(null, null);
       sayilariTopla(50, null);
       sayilariTopla(null, 20);

       var sayi1=20;
       System.out.println(sayi1);
    }

    public static void sayilariTopla(Integer sayi1,Integer sayi2){
        //Parametrelere değer atanmışmı atanmamışmı kontrol edilir
        sayi1 = sayi1 == null ? 0 : sayi1.intValue();
        sayi2 = sayi2 == null ? 0 : sayi2.intValue();
		
        int toplam = sayi1+sayi2;
        System.out.println(toplam);
    }

    /*
     * Diğer Sarmalıyıcı Sınıflar için örnek
     *  b = b == null ? "boş string" : b;
	    c = c == null ? true : c;
     */
}
