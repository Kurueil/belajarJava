import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner inputKey = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Perulangan : ");
        int jumlahPerulangan = inputKey.nextInt();
        for (int i = 0; i < jumlahPerulangan; i++) {
            System.out.println("Bilangan : " + (i + 1));
        }

    }
}
