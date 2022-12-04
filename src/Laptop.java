public class Laptop extends Perangkat {
    protected boolean webcam;
    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    public void informasi() {
        if(this.webcam == true) {
            System.out.println("Laptop ini memiliki drive dengan tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu laptop ini juga memiliki webcam");
        }else{
            System.out.println("Laptop ini memiliki drive dengan tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. :Laptop ini tidak memiliki webcam");
        }
    }
    public void bukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game " +nama_game);
    }
    public static void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim email ke " +email);
    }
    public static void kirimEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim email ke " +email1 + " dan ke " +email2);
    }
}