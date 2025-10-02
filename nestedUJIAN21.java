import java.util.Scanner;
public class nestedUJIAN21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel pesan
        String pesan;

        // Input status bebas kompen
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        // Input jumlah log bimbingan
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        // Nested IF untuk mengecek syarat
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi.";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali.";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali.";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali.";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen.";
        }

        // Output hasil
        System.out.println(pesan);

        sc.close();
    }
}
