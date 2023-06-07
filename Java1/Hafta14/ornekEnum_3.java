public class ornekEnum_3 {

    enum MobilTelefon {
        Samsung(18500), Nokia(7500), Iphone(24000);

        int ucret;

        MobilTelefon(int p) {
            ucret = p;
        }

        int ucretGoster() {
            return ucret;
        }
    }

    public static void main(String[] args) {
        System.out.println("Telefon Listesi:");
        for (MobilTelefon m : MobilTelefon.values()) {
            System.out.println(m + " ücreti " + m.ucretGoster() + " TL");
        }

        MobilTelefon mt1 = MobilTelefon.Samsung;
        System.out.println("Enum içindeki sırası = " + mt1.ordinal());
        System.out.println("Enum ismi = " + mt1.name());
    }
}
