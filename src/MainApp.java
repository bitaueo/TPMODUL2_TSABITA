public class MainApp {
    public static void main(String[] args) throws Exception{
        Perangkat perangkat = new Perangkat("Adata", 4, 2.0f);
        perangkat.informasi();
        System.out.println();

        Handphone handphone = new Handphone("Sandisk", 2, 3.2f, true);
        handphone.informasi();
        handphone.telpon(628123470);
        handphone.kirimSMS(628345679);
        handphone.kirimSMS(62923467, 62786501);
        System.out.println();

        Laptop laptop = new Laptop("Seagate", 16, 3.0f, false);
        laptop.informasi();
        laptop.bukaGame("Valorant");
        laptop.kirimEmail("apaya@gmail.com");
        laptop.kirimEmail("hmmmm@gmail.com", "sabar@gmail.com");
        System.out.println();
    }
}