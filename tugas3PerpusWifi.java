import java.util.Scanner;
public class tugas3PerpusWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Sistem Perpustakaan dan Akses WiFi Kampus---");

        // Cek status anggota perpustakaan
        System.out.print("Apakah Anda anggota perpustakaan? (ya/tidak): ");
        String anggota = sc.next().trim().toLowerCase();

        if (anggota.equals("ya")) {
            System.out.println("Anda boleh meminjam buku.");
        } else {
            System.out.println("Anda tidak boleh meminjam buku, silakan daftar dulu.");
        }

        // Cek akses wifi
        System.out.print("Apakah Anda mahasiswa kampus ini? (ya/tidak): ");
        String mahasiswa = sc.next().trim().toLowerCase();

        if (mahasiswa.equals("ya")) {
            System.out.println("Anda mendapat akses WiFi kampus.");
        } else {
            System.out.println("Anda tidak berhak mendapat akses WiFi.");
        }

        sc.close();
    }
    
}
