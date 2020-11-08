import java.io.Console;

class Pola {
    public static void main(String[] args) {
        Console input = System.console();
        
        System.out.println("Pilih bangun datar yang ingin dicetak polanya:");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        
        String tipe = input.readLine("Pilihan: ");
        int fail = 1;
        while (!tipe.equals("1") && !tipe.equals("2")) {
            System.out.println("Pilihan tidak tersedia");
            tipe = input.readLine("Pilihan: ");
            
            fail++;
            if (fail > 2) {
                System.out.println("Anda telah salah memasukkan pilihan sebanyak 3 kali");
                System.exit(0);
            }
        }

        System.out.println("==============================================");

        int length = Integer.parseInt(input.readLine("Masukkan panjang karakter untuk membentuk pola: "));
        if (tipe.equals("1")) { // Pola Persegi
            for (int i=0; i<length; i++) {
                for (int j=0; j<length; j++) {
                    if (j==0 || j==length-1 || i==0 || i==length-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                System.out.println();
            }
        } else if (tipe.equals("2")) { // Pola Segitiga
            for (int i=0; i<length; i++) {
                for (int k=length; k>i; k--) {
                    System.out.print(" ");
                }
                for (int j=0; j<i; j++) {
                    if (j==0 || i==length-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j=0; j<i; j++) {
                    if (j>0) {
                        if ((j==i-1 || i==length-1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }

                System.out.println();
            }
        }
    }
}