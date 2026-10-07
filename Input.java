// import java.util.Scanner;

// public class Input {
//     public static void main(String[] args) {
//         Scanner inputKey = new Scanner(System.in);
//         Scanner inputStr = new Scanner(System.in);

//         System.out.print("Masukkan nama anda: ");
//         String nama = inputStr.nextLine();
//         System.out.print("Masukkan bilangan pertama: ");
//         int bil1 = inputKey.nextInt();
//         System.out.print("Masukkan bilangan kedua: ");
//         int bil2 = inputKey.nextInt();
//         int hasil = bil1 + bil2;
//         System.out.println("Nama anda : " + nama);
//         System.out.println("Hasil penjumlahan dari " + bil1 + " + " + bil2 + " = " + hasil);
//     }
// }

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama anda: ");
            String nama = input.nextLine();

            int bil1 = bacaBilangan(input, "Masukkan bilangan pertama: ");
            int bil2 = bacaBilangan(input, "Masukkan bilangan kedua: ");

            int hasil = bil1 + bil2;
            System.out.println("Nama anda : " + nama);
            System.out.println("Hasil penjumlahan dari " + bil1 + " + " + bil2 + " = " + hasil);
        }
    }

    private static int bacaBilangan(Scanner input, String pesan) {
        System.out.print(pesan);
        while (!input.hasNextInt()) {
            System.out.println("Input tidak valid, masukkan bilangan bulat.");
            input.next();
            System.out.print(pesan);
        }
        return input.nextInt();
    }
}