// public class Hello {
//     public static void main(String[] args) {
//         System.out.println("Belajar Pemrograman Java");

//         int nilaiPemrograman = 90;
//         int nilaiBahasaIndonesia = 80;
//         String namaMahasiswa = "Angga Pradita";
//         String nimMahasiswa = "2615354043";

//         System.out.println("Nama Mahasiswa: " + namaMahasiswa);
//         System.out.println("NIM Mahasiswa: " + nimMahasiswa);
//         System.out.println("Nilai Pemrograman Java: " + nilaiPemrograman);
//         System.out.println("Nilai Bahasa Indonesia: " + nilaiBahasaIndonesia);
//     }
// }

public class Hello {
    public static void main(String[] args) {
        final String namaMahasiswa = "Angga Pradita";
        final String nimMahasiswa = "2615354043";
        int nilaiPemrograman = 90;
        int nilaiBahasaIndonesia = 80;

        double rataRata = (nilaiPemrograman + nilaiBahasaIndonesia) / 2.0;

        System.out.println("Belajar Pemrograman Java");
        System.out.println("Nama Mahasiswa          : " + namaMahasiswa);
        System.out.println("NIM Mahasiswa           : " + nimMahasiswa);
        System.out.println("Nilai Pemrograman Java  : " + nilaiPemrograman);
        System.out.println("Nilai Bahasa Indonesia  : " + nilaiBahasaIndonesia);
        System.out.printf ("Nilai Rata-rata         : %.2f%n", rataRata);
    }
}