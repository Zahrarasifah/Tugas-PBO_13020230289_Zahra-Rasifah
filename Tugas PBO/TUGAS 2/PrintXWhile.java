import java.util.Scanner; 

/* Program untuk membaca angka x dan menjumlahkannya dengan while */
public class PrintXWhile { 
    public static void main(String[] args) { 
        // Deklarasi variabel
        int Sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);

        // Input pertama
        System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt(); 

        // Menggunakan while loop untuk menjumlahkan angka
        while (x != 999) { // Perulangan berhenti jika 999 dimasukkan
            Sum += x;  // Menambahkan angka ke total

            // Meminta input angka berikutnya
            System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
            x = masukan.nextInt();
        }

        // Menampilkan hasil jumlah
        System.out.println("Hasil penjumlahan = " + Sum);

        // Menutup Scanner untuk menghindari memory leak
        masukan.close();  
    } 
}
