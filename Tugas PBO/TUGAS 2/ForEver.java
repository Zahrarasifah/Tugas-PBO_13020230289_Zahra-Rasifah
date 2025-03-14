import java.util.Scanner;

public class ForEver {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Program */
        System.out.println("Program akan looping, ketik 'exit' untuk mengakhiri.");
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Print satu baris ....\n");
            System.out.print("Ketik 'exit' untuk berhenti: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break; // keluar dari loop jika pengguna mengetik 'exit'
            }
        }
        
        scanner.close(); // menutup scanner
        System.out.println("Program dihentikan.");
    }
}