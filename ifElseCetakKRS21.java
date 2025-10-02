import java.util.Scanner;
public class ifElseCetakKRS21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Cetak KRS Siakad---");
        System.out.print("Masukkan semester Anda (1-8): ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("Menampilkan KRS Semester 1");
        } else if (semester == 2) {
            System.out.println("Menampilkan KRS Semester 2");
        } else if (semester == 3) {
            System.out.println("Menampilkan KRS Semester 3");
        } else if (semester == 4) {
            System.out.println("Menampilkan KRS Semester 4");
        } else if (semester == 5) {
            System.out.println("Menampilkan KRS Semester 5");
        } else if (semester == 6) {
            System.out.println("Menampilkan KRS Semester 6");
        } else if (semester == 7) {
            System.out.println("Menampilkan KRS Semester 7");
        } else if (semester == 8) {
            System.out.println("Menampilkan KRS Semester 8");
        } else {
            System.out.println("Semester tidak valid!");
        }

        sc.close();
    }
    
}
