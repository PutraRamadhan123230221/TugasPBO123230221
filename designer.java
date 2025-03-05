package TugasPBO;
import java.util.List;

class Designer extends Pegawai implements BonusTahunan {
    private List<String> softwareDesain;

    public Designer(String nama, double gaji, List<String> softwareDesain) {
        super(nama, gaji);
        this.softwareDesain = softwareDesain;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Designer: " + nama);
        System.out.println("Gaji: " + gaji);
        System.out.println("Software Desain: " + softwareDesain);
        System.out.println("Bonus Tahunan: " + hitungBonus());
        System.out.println("-----------------------------");
    }

    @Override
    public double hitungBonus() {
        return gaji * 0.08;
    }
}