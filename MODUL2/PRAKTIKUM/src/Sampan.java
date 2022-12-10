public class Sampan extends TransportasiAir {
    protected int layar;
    public Sampan(int biaya, int jumlahKursi, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    @Override
    public void informasi() {
        System.out.println("Transportasi Air Sampan dengan kursi berjumlah " + jumlahKursi + " dengan harga Rp. " + biaya);
    }
    @Override
    public void berlayar() {
        System.out.println("Transportasi Air Sampan sedang berlayar menggunakan " + layar + " layar");
    }
    @Override
    public void berlabuh() {
        System.out.println("Transportasi Air Sampan sedang berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar) {
        System.out.println("Transportasi Air Sampan sedang berlabuh di pantai menggunakan " + jangkar +" jangkar");
    }
}
