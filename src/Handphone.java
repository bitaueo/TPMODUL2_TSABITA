public class Handphone extends Perangkat {
    protected boolean fingerprint;
    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    public void informasi() {
        if (fingerprint == true) {
            System.out.println("Handphone ini memiliki drive dengan tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu handphone ini juga memiliki fingeprint");
        }else{
            System.out.println("Handphone ini memiliki drive dengan tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. handphone ini tidak memiliki fingeprint");
        }
    }
    public void telpon(int no_hp) {
        System.out.println("Handphone berhasil menyambungkan telpon ke no " + no_hp);
    }
    public void kirimSMS(int no_hp) {
        System.out.println("Handphone berhasil mengirim SMS ke no " + no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone berhasil mengirim SMS ke no " + no_hp1 + " dan ke no " + no_hp2);
    }
}

