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
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();

        int hasil = bil1 + bil2;

        System.out.println("Nama anda : " + nama);
        System.out.println("Hasil penjumlahan dari " + bil1 + " + " + bil2 + " = " + hasil);

        input.close();
    }
}