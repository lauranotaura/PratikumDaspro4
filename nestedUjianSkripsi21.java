import java.util.Scanner;
public class nestedUjianSkripsi21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Pendaftaran Ujian Skripsi---");

        // Input status kompen
        System.out.print("Apakah Anda bebas kompen? (Yes/No): ");
        String bebasKompen = sc.next().trim();

        // Input jumlah bimbingan
        System.out.print("Masukkan jumlah bimbingan dengan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah bimbingan dengan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        String pesan;

        // Nested IF
        if (bebasKompen.equalsIgnoreCase("Yes")) {
            if (bimbinganP1 >= 8) {
                if (bimbinganP2 >= 4) {
                    pesan = "Anda memenuhi syarat. Silakan lanjut daftar ujian skripsi.";
                } else {
                    pesan = "Ditolak: Bimbingan dengan Pembimbing 2 kurang dari 4 kali.";
                }
            } else {
                pesan = "Ditolak: Bimbingan dengan Pembimbing 1 kurang dari 8 kali.";
            }
        } else {
            pesan = "Ditolak: Anda masih memiliki kompen.";
        }

        System.out.println(pesan);

        sc.close();
    }
    
}
