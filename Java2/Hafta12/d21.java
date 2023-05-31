import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class d21 {
    public static void main(String[] args) {
        Date tarihSaat = new Date();
        System.out.println(tarihSaat.toString());//Wed May 24 16:26:32 TRT 2023

        DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(df1.format(tarihSaat));//2023/05/24

        DateFormat df2 = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(df2.format(tarihSaat));//24.05.2023

    }
}
