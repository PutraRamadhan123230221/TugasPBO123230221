package TugasPBO;
import java.util.List;

class Programmer extends Pegawai implements BonusTahunan {
    private List<String> bahasaPemrograman;

    public Programmer(String nama, double gaji, List<String> bahasaPemrograman) {
        super(nama, gaji);
        this.bahasaPemrograman = bahasaPemrograman;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Programmer: " + nama);
        System.out.println("Gaji: " + gaji);
        System.out.println("Bahasa Pemrograman: " + bahasaPemrograman);
        System.out.println("Bonus Tahunan: " + hitungBonus());
        System.out.println("-----------------------------");
    }

    @Override
    public double hitungBonus() {
        return gaji * 0.10;
    }
}