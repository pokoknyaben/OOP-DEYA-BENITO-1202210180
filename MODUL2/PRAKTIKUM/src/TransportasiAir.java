public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    public void informasi(){
        System.out.println("Transportasi Air tidak diketahui dengan kursi berjumlah " + jumlahKursi + " dengan harga Rp. " + biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air tidak diketahui sedang berlabuh");
    }
}
