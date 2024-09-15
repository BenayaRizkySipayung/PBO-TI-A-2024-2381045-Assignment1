import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah angka: ");
        int jumlahKata = input.nextInt();

        int[] array = new int[jumlahKata];

        for (int i = 0; i < jumlahKata; i++) {
            System.out.println("Angka ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        int total = 0;
        for (int i = 0; i < jumlahKata; i++) {
            total += array[i];
        }
        System.out.println("Totalnya ialah: " + total);
    }
}
