import java.util.Scanner;
public class IFcetakKRS21 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Cetak KRS Siakad---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // Struktur IF
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi.");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA.");
        }

        sc.close();
    }
    
}
