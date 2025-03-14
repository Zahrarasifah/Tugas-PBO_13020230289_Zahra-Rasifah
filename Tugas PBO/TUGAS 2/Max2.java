import java.util.Scanner; 

/* Program untuk mencari nilai maksimum dari dua bilangan */
public class Max2 { 
    public static void main(String[] args) { 
        // Deklarasi variabel
        int a, b;
        
        // Scanner untuk input
        Scanner masukan = new Scanner(System.in); 

        // Input dari pengguna
        System.out.println("Maksimum dua bilangan: ");
        System.out.print("Ketikkan dua bilangan, pisahkan dengan ENTER: ");
        
        a = masukan.nextInt(); 
        b = masukan.nextInt(); 

        // Menampilkan bilangan yang diinput
        System.out.println("Kedua bilangan: a = " + a + ", b = " + b);

        // Menentukan nilai maksimum
        if (a >= b) { 
            System.out.println("Nilai maksimum: " + a);
        } else { 
            System.out.println("Nilai maksimum: " + b);
        }

        // Menutup Scanner
        masukan.close(); 
    } 
}
