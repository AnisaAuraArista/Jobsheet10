import java.util.Scanner;

public class Tugas04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;
        int[][] survey = new int[responden][pertanyaan];

        System.out.println("=== Input Nilai Survei Kepuasan Pelanggan (1 - 5) ===");
        for (int i = 0; i < responden; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("Nilai pertanyaan ke-" + (j + 1) + ": ");
                survey[i][j] = input.nextInt();
            }
        }
       
        System.out.println("\n=== Rata-rata Tiap Responden ===");
        for (int i = 0; i < responden; i++) {
            double total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += survey[i][j];
            }
            double rataResponden = total / pertanyaan;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataResponden);
        }
       
        System.out.println("\n=== Rata-rata Tiap Pertanyaan ===");
        for (int j = 0; j < pertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < responden; i++) {
                total += survey[i][j];
            }
            double rataPertanyaan = total / responden;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rataPertanyaan);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }

        double rataKeseluruhan = totalKeseluruhan / (responden * pertanyaan);
        System.out.println("\n=== Rata-rata Keseluruhan ===");
        System.out.println("Rata-rata keseluruhan nilai survei: " + rataKeseluruhan);

        input.close();
    }
}
