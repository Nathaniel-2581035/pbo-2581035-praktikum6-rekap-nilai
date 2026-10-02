import java.util.Scanner;

public class RekapNilai {
    static final int selesai = -1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSah = 0;
        int nilai;

        System.out.println("=== REKAP NILAI ===");
        System.out.println("Ketik -1 jika sudah selesai");

        do {
            System.out.print("Nilai ke-" + (jumlahSah + 1) + ": ");
            nilai = input.nextInt();

            if (nilai == selesai) {
                break;
            }

        if (nilai < 0 || nilai > 100) {
            System.out.println("Ditolak, Harus 0-100");
            continue;
        }
        jumlahSah++;

        char grade;
        if (nilai >= 90) {
            grade = 'A';
        } else if (nilai >= 80) {
            grade = 'B';
        } else if (nilai >= 70) {
            grade = 'C';
        } else if (nilai >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        String keterangan = switch (grade) {
           case 'A' -> "Sangat Baik";
           case 'B' -> "Baik";
           case 'C' -> "Cukup";
           case 'D' -> "Kurang";
           default -> "Gagal";
        };
        System.out.println("Grade " + grade + " - " + keterangan);
        } while (nilai != selesai);

        System.out.println();
        System.out.println("Nilai sah: " + jumlahSah);
    }
}
