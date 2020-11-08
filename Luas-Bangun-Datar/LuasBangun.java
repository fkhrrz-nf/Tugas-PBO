import java.io.Console;

class LuasBangun {
    public static void main(String[] args) {
        Console input = System.console();
        
        System.out.println("Pilih bangun datar yang ingin dihitung:");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        
        String tipe = input.readLine("Pilihan: ");
        int fail = 1;
        while (!tipe.equals("1") && !tipe.equals("2") && !tipe.equals("3")) {
            System.out.println("Pilihan tidak tersedia");
            tipe = input.readLine("Pilihan: ");
            
            fail++;
            if (fail > 2) {
                System.out.println("Anda telah salah memasukkan pilihan sebanyak 3 kali");
                System.exit(0);
            }
        }

        System.out.println("==============================================");

        float luas;
        if (tipe.equals("1")) { // Luas Persegi
            int sisi = Integer.parseInt(input.readLine("Masukkan nilai sisi persegi: "));
            luas = sisi * sisi;
        } else if (tipe.equals("2")) { // Luas Segitiga
            float alas = Float.parseFloat(input.readLine("Masukkan nilai alas segitiga: "));
            float tinggi = Float.parseFloat(input.readLine("Masukkan nilai tinggi segitiga: "));
            luas = (float)0.5 * alas * tinggi;
        } else { // Luas Lingkaran
            float phi = 0;
            int jari = Integer.parseInt(input.readLine("Masukkan nilai jari-jari lingkaran: "));
            if (jari % 7 == 0) {
                phi = (float)22 / 7;
            } else {
                phi = (float)3.14;
            }
            luas = phi * (float)(jari * jari);
        }

        System.out.println(luas);
    }
}