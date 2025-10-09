import java.util.Locale;
import java.util.Scanner;
    public class CM_21 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // --- Variabel Data Mahasiswa ---
        String nama;
        String nim;

        // --- Variabel Mata Kuliah 1: Algoritma dan Pemrograman (AP) ---
        double uts_AP, uas_AP, tugas_AP;
        double nilaiAkhir_AP;
        String status_AP, grade_AP = "";

        // --- Variabel Mata Kuliah 2: Struktur Data (SD) ---
        double uts_SD, uas_SD, tugas_SD;
        double nilaiAkhir_SD;
        String status_SD, grade_SD = "";

        // --- Variabel Kelulusan Semester ---
        double rataRataAkhir;
        String statusSemester;

        // ====================================================================
        // I. INPUT DATA MAHASISWA (Sama Persis dengan Contoh)
        // ====================================================================
        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama : ");
        nama = sc.nextLine();
        System.out.print("NIM  : "); 
        nim = sc.nextLine();

        // Input AP (menggunakan data dari contoh: 60, 70, 50)
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS  : ");
        uts_AP = sc.nextDouble(); // Input: 60
        System.out.print("Nilai UAS  : ");
        uas_AP = sc.nextDouble(); // Input: 70
        System.out.print("Nilai Tugas: ");
        tugas_AP = sc.nextDouble(); // Input: 50

        // Input SD (menggunakan data dari contoh: 70, 80, 80)
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS  : ");
        uts_SD = sc.nextDouble(); // Input: 70
        System.out.print("Nilai UAS  : ");
        uas_SD = sc.nextDouble(); // Input: 80
        System.out.print("Nilai Tugas: ");
        tugas_SD = sc.nextDouble(); // Input: 80

        // ====================================================================
        // II. PROSES PERHITUNGAN DAN STATUS PER MATKUL
        // ====================================================================
        
        // 1. Matkul Algoritma dan Pemrograman (AP)
        // Nilai Akhir: (30% UTS) + (40% UAS) + (30% Tugas) [cite: 18, 19]
        nilaiAkhir_AP = (uts_AP * 0.3) + (uas_AP * 0.4) + (tugas_AP * 0.3);

        // Status Kelulusan Matkul: LULUS jika Nilai Akhir >= 60 [cite: 23, 24, 25]
        status_AP = (nilaiAkhir_AP >= 60) ? "LULUS" : "TIDAK LULUS";
        
        // Konversi Nilai Huruf AP [cite: 27]
        if (nilaiAkhir_AP > 80) { grade_AP = "A"; } 
        else if (nilaiAkhir_AP > 73) { grade_AP = "B+"; } 
        else if (nilaiAkhir_AP > 65) { grade_AP = "B"; } 
        else if (nilaiAkhir_AP > 60) { grade_AP = "C+"; } 
        else if (nilaiAkhir_AP > 50) { grade_AP = "C"; } 
        else if (nilaiAkhir_AP > 39) { grade_AP = "D"; } 
        else { grade_AP = "E"; }

        // 2. Matkul Struktur Data (SD)
        nilaiAkhir_SD = (uts_SD * 0.3) + (uas_SD * 0.4) + (tugas_SD * 0.3);

        // Status Kelulusan Matkul [cite: 23, 24, 25]
        status_SD = (nilaiAkhir_SD >= 60) ? "LULUS" : "TIDAK LULUS";
        
        // Konversi Nilai Huruf SD [cite: 27]
        if (nilaiAkhir_SD > 80) { grade_SD = "A"; } 
        else if (nilaiAkhir_SD > 73) { grade_SD = "B+"; } 
        else if (nilaiAkhir_SD > 65) { grade_SD = "B"; } 
        else if (nilaiAkhir_SD > 60) { grade_SD = "C+"; } 
        else if (nilaiAkhir_SD > 50) { grade_SD = "C"; } 
        else if (nilaiAkhir_SD > 39) { grade_SD = "D"; } 
        else { grade_SD = "E"; }

        // 3. Rata-Rata Nilai Akhir
        rataRataAkhir = (nilaiAkhir_AP + nilaiAkhir_SD) / 2; // Contoh: (61.00 + 77.00) / 2 = 69.00 [cite: 76]

        // 4. Status Kelulusan Semester (Nested If) [cite: 28, 29, 35, 36, 37, 38, 39, 40, 41, 42]
        if (status_AP.equals("LULUS") && status_SD.equals("LULUS")) {
            // Inner Check (Nested If): Jika kedua matkul LULUS, cek Rata-rata
            if (rataRataAkhir >= 70) { 
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)"; // Contoh: 69.00 < 70
            }
        } else { 
            // Else Block: Jika salah satu atau kedua TIDAK LULUS
            statusSemester = "TIDAK LULUS (Salah satu mata kuliah tidak lulus)";
        }

        // ====================================================================
        // III. OUTPUT HASIL (Sama Persis dengan Contoh)
        // ====================================================================
        
        System.out.println("\n\n=== HASIL PENILAIAN AKADEMIK ===");
        System.out.println("Nama : " + nama); // Output: Cindy Canda [cite: 59]
        System.out.println("NIM  : " + nim); // Output: 232343245 [cite: 60]

        // Header Tabel [cite: 61, 62, 63, 64, 65]
        System.out.printf("\n%-30s %-5s %-5s %-5s %-12s %-12s %-12s\n", 
            "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");
        
        // Data Matkul AP [cite: 66, 67, 68, 69, 74, 75]
        System.out.printf("%-30s %-5.0f %-5.0f %-5.0f %-12.2f %-12s %-12s\n", 
            "Algoritma Pemrograman", uts_AP, uas_AP, tugas_AP, nilaiAkhir_AP, grade_AP, status_AP);
            
        // Data Matkul SD [cite: 70, 71, 72, 73, 74, 75]
        System.out.printf("%-30s %-5.0f %-5.0f %-5.0f %-12.2f %-12s %-12s\n", 
            "Struktur Data", uts_SD, uas_SD, tugas_SD, nilaiAkhir_SD, grade_SD, status_SD);

        System.out.println("\nRata-rata Nilai Akhir: " + String.format("%.2f", rataRataAkhir)); // Output: 69.00 [cite: 76]
        System.out.println("Status Semester      : " + statusSemester); // Output: TIDAK LULUS (Rata-rata < 70) [cite: 78]

        sc.close();
        }
    }