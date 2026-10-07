// import java.util.Scanner;

// public class LoopFor {
//     public static void main(String[] args) {
//         Scanner inputKey = new Scanner (System.in);
//         System.out.print("Masukkan Jumlah Perulangan : ");
//         int jumlahPerulangan = inputKey.nextInt();
//         for (int i = 0; i < jumlahPerulangan; i++) {
//             System.out.println("Bilangan : " + (i + 1));
//         }

//     }
// }

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        try (Scanner inputKey = new Scanner(System.in)) {
            System.out.print("Masukkan Jumlah Perulangan : ");

            if (!inputKey.hasNextInt()) {
                System.out.println("Input tidak valid, masukkan bilangan bulat.");
                return;
            }

            int jumlahPerulangan = inputKey.nextInt();

            if (jumlahPerulangan <= 0) {
                System.out.println("Jumlah perulangan harus lebih dari 0.");
                return;
            }

            for (int i = 1; i <= jumlahPerulangan; i++) {
                System.out.println("Bilangan : " + i);
            }
        }
    }
}