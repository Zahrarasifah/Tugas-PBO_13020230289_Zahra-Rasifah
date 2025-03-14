import java.util.Scanner; 

/* Program untuk membaca angka x dan menjumlahkannya dengan do-while */
public class PrintXRepeat { 
    public static void main(String[] args) { 
        // Deklarasi variabel
        int Sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);

        // Input pertama
        System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt(); 

        // Jika input pertama adalah 999, langsung keluar
        if (x == 999) {
            System.out.println("Kasus kosong");
        } else {  
            // Menggunakan do-while untuk menjumlahkan angka yang dimasukkan
            do {
                Sum += x;  // Menambahkan angka ke jumlah total
                
                // Input berikutnya
                System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
                x = masukan.nextInt();
                
            } while (x != 999); // Berhenti jika angka 999 dimasukkan

            // Menampilkan hasil jumlah
            System.out.println("Hasil penjumlahan = " + Sum);
        }

        // Menutup Scanner untuk menghindari memory leak
        masukan.close();  
    } 
}
