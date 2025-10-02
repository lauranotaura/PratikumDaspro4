import java.util.Scanner;
public class Tugas2CetakKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Tugas 2: Implementasi Flowchart---");

        // Contoh: cek apakah nilai mahasiswa >= 60 maka Lulus, kalau tidak Gagal
        // (ganti logika ini sesuai dengan flowchart di jobsheet kamu)
        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = sc.nextInt();

        if (nilai >= 60) {
            System.out.println("Mahasiswa dinyatakan LULUS.");
        } else {
            System.out.println("Mahasiswa dinyatakan TIDAK LULUS.");
        }

        sc.close();
    }
    
}
