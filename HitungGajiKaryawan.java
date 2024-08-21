import java.util.Scanner;

public class HitungGajiKaryawan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah jam kerja
        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = scanner.nextInt();

        // Meminta input tarif per jam
        System.out.print("Masukkan tarif per jam: ");
        double tarifPerJam = scanner.nextDouble();

        // Menghitung gaji bruto (jam kerja * tarif per jam)
        double gajiBruto = jamKerja * tarifPerJam;

        // Menghitung potongan pajak (10% dari gaji bruto)
        double potonganPajak = gajiBruto * 0.10;

        // Menghitung gaji bersih (gaji bruto - potongan pajak)
        double gajiBersih = gajiBruto - potonganPajak;

        // Menampilkan hasil
        System.out.println("Gaji Bruto: Rp " + gajiBruto);
        System.out.println("Potongan Pajak (10%): Rp " + potonganPajak);
        System.out.println("Gaji Bersih yang Diterima: Rp " + gajiBersih);

        // Menutup scanner
        scanner.close();
    }
}
