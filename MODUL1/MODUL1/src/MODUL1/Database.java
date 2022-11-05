import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    int pilih;
    Database() {
        System.out.println("=================================");
        System.out.println("1. Menu \n2. Pilih Menu \n3. Keluar");
        System.out.println("=================================");

        Scanner input1 = new Scanner(System.in);
        System.out.print("Masukan Pilihan: ");
        int pilih = input1.nextInt();
        input1.close();

        if (pilih == 1){
            System.out.println("Menu");
            System.out.println("=================================");
        }
        else if (pilih == 2){
            return;
        }
        else if (pilih == 3){
            return;
        }

    }
}
