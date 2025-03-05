package TugasPBO;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Tugas1 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pegawai> daftarPegawai = new ArrayList<>();

        try {
            System.out.print("Masukkan nama Programmer: ");
            String namaProg = scanner.nextLine();
            System.out.print("Masukkan gaji Programmer: ");
            double gajiProg = scanner.nextDouble();
            scanner.nextLine(); 
            List<String> bahasaProg = new ArrayList<>();
            bahasaProg.add("Java");
            bahasaProg.add("Python");

            daftarPegawai.add(new Programmer(namaProg, gajiProg, bahasaProg));

            System.out.print("Masukkan nama Designer: ");
            String namaDes = scanner.nextLine();
            System.out.print("Masukkan gaji Designer: ");
            double gajiDes = scanner.nextDouble();
            scanner.nextLine();
            List<String> softwareDes = new ArrayList<>();
            softwareDes.add("Photoshop");
            softwareDes.add("Figma");

            daftarPegawai.add(new Designer(namaDes, gajiDes, softwareDes));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Gaji harus berupa angka!");
        } finally {
            System.out.println("Proses input pegawai selesai.\n");
        }

        System.out.println("=== Data Pegawai ===");
        for (Pegawai pegawai : daftarPegawai) {
            pegawai.tampilkanInfo();
        }

        scanner.close();
    }
}
