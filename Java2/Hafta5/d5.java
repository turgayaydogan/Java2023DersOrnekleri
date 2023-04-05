public class d5 {
    public static void main(String[] args) {
        for(int sayi = 1; sayi <= 10; sayi++){
            if(sayi==5)
                continue;// dongunun son satırına gider

            System.out.println(sayi);
        }

        for(int sayi = 1; sayi <= 10; sayi++){
            if(sayi==5)
                break;// dongunun çıkış satırına gider

            System.out.println(sayi);
        }
        //çıkış
    }
}
