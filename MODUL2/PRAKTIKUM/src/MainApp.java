public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportAir = new TransportasiAir(6, 10000);
        transportAir.informasi();
        transportAir.berlayar();
        transportAir.berlabuh();
        System.out.println("");
        Sampan sampanAja = new Sampan(15000, 20, 1);
        sampanAja.informasi();
        sampanAja.berlayar();
        sampanAja.berlabuh();
        sampanAja.berlabuh(1);
        System.out.println("");
        Kapal kapalAja = new Kapal(400, 80000, "Diesel");
        kapalAja.informasi();
        kapalAja.berlayar();
        kapalAja.berlayar(18);
        kapalAja.berlabuh();
    }
}
