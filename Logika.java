public class Logika {
    public static void main(String[] args) {
        boolean kondisi1 = true;
        boolean kondisi2 = false;
        boolean hasil;

        hasil = kondisi1 && kondisi2;
        System.out.println("Hasil dari " + kondisi1 + " && " + kondisi2 + " = " + hasil);
        hasil = kondisi1 && kondisi2 && kondisi1;;
        System.out.println("Hasil dari " + kondisi1 + " && " + kondisi2 + " && " + kondisi1 +" = " + hasil);
        hasil = kondisi1 || kondisi2;
        System.out.println("Hasil dari " + kondisi1 + " || " + kondisi2 + " = " + hasil);
        hasil = kondisi1 || kondisi2 || kondisi1;
        System.out.println("Hasil dari " + kondisi1 + " || " + kondisi2 + " || " + kondisi1 +" = " + hasil);
    }    
}
