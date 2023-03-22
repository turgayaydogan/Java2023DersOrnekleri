import java.util.Scanner;

public class d7 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        double not1,not2,ort;

        System.out.println("Not1:");
        not1 = giris.nextDouble();     // double = double

        System.out.println("Not2:");
        not2=giris.nextDouble();

        //ort = (not1 + not2) / 2.0; // int+int= int /2.0 = double ==> int = double HATALI

        ort = (not1+not2)/2; //double+double = double /int = double ==> double=double

        System.out.println("Oralaman="+ort);
    }
}
